/* Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sailing.hrm.workflow.util;

import org.snaker.engine.model.NodeModel;
import org.snaker.engine.parser.impl.TaskParser;
import org.w3c.dom.Element;

import com.sailing.hrm.workflow.extend.ExtTaskModel;

/**
 * 
 * @auther guanxianchun
 * @description
 * @version 1.0
 * @date 2015年8月19日 下午2:39:17
 */
public class ExtTaskParser extends TaskParser {
	
	protected void parseNode(NodeModel node, Element element) {
		ExtTaskModel task = (ExtTaskModel)node;
		task.setCcperson(element.getAttribute("ccperson"));
		super.parseNode(node, element);
	}

	protected NodeModel newModel() {
		return new ExtTaskModel();
	}
}
