package com.sailing.hrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sailing.hrm.persistent.base.GenericDao;
import com.sailing.hrm.persistent.customer.bean.User;
import com.sailing.hrm.persistent.customer.dao.UserDao;

@Service
public class UserService {
	@Autowired
	GenericDao genericDao;
	public void addUser(User user) {
		genericDao.save(user);
	}
	
	public List<User> getUsers() {
		String hql = "select t from User t";
		return genericDao.findByPage(hql, 0, 5);
	}
}
