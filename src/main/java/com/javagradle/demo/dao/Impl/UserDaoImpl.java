package com.javagradle.demo.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.javagradle.demo.dao.UserDao;
import com.javagradle.demo.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
