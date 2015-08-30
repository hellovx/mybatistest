package com.zh.mapper.test;

import java.util.List;

import com.zh.pojo.test.Users;

public interface UsersMapper {
	
	public List<Users> getUsersList();
	public int insertUsersInfo(Users user);

}
