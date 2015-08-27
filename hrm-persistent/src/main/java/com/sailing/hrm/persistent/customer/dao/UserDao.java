package com.sailing.hrm.persistent.customer.dao;

import org.springframework.stereotype.Component;

import com.sailing.hrm.persistent.base.HibernateDao;
import com.sailing.hrm.persistent.customer.bean.User;

/**
 * 用户持久化类
 * @author yuqs
 * @since 0.1
 */
@Component
public class UserDao extends HibernateDao<User, Long> {
	
}
