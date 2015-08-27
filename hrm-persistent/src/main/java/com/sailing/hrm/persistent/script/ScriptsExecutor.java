/*
 *  Copyright 2013-2014 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.sailing.hrm.persistent.script;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.ibatis.common.jdbc.ScriptRunner;
import com.ibatis.common.resources.Resources;
import com.mysql.jdbc.Connection;
import com.sailing.hrm.persistent.util.JdbcUtils;

/**
 * 脚本执行类
 * 
 * @author yuqs
 * @since 1.0
 */
public class ScriptsExecutor {
	private static final Logger log = Logger.getLogger(ScriptsExecutor.class);

	public void run() {
		log.info("scripts running......");
		runScript();
		log.info("scripts has runned.");
	}

	public void runScript() {
		Connection conn = null;
		try {
			Properties props = Resources.getResourceAsProperties("jdbc.properties");
			String url = props.getProperty("jdbc.url");
			String driver = props.getProperty("jdbc.driverClassName");
			String username = props.getProperty("jdbc.username");
			String password = props.getProperty("jdbc.password");
			Class.forName(driver).newInstance();
			conn = (Connection) DriverManager.getConnection(url, username, password);
			String databaseType = JdbcUtils.getDatabaseType(conn);

			String[] schemas = new String[] { "schema-" + databaseType + ".sql", "init-data.sql" };
			ScriptRunner runner = new ScriptRunner(conn, false, false);
			runner.setErrorLogWriter(null);
			runner.setLogWriter(null);
			for (int i = 0; i < schemas.length; i++) {
				runner.runScript(Resources.getResourceAsReader(schemas[i]));
			}
			conn.commit();
		} catch (Exception e) {
			log.error("running scripts is error.", e);
			try {
				if (conn != null && !conn.isClosed()) {
					conn.rollback();
				}
			} catch (SQLException e1) {
				log.error("database rollback is error.", e1);
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				log.error("closing database connection is error.", e);
			}
		}

	}
}
