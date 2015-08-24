package com.zh.test.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zh.po.test.Users;
import com.zh.service.test.UsersService;

public class UsersTest {

	@Autowired
	private UsersService usersService;

	@Test
	public void UsersTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		usersService = (UsersService) context.getBean("usersService");
		List<Users> list= usersService.getUsersList();
		
		for(Users u:list){
			
			System.out.println(u.getName());
		}

	}

}
