package com.sailing.hrm.persistent.security.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.security.bean.Authority;

/**
 * 权限持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class AuthorityDao extends HibernateDao<Authority, Long> {

}
