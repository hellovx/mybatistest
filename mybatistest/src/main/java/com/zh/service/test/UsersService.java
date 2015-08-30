package com.zh.service.test;

import java.util.List;

import com.zh.pojo.test.Users;

public interface UsersService {
	
	public List<Users> getUsersList();
	public int insertUsersInfo(Users user);
}
