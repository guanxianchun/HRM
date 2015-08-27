package com.sailing.hrm.persistent.security.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.security.bean.Role;

/**
 * 角色持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class RoleDao extends HibernateDao<Role, Long> {

}
