package com.zh.service.impl.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zh.mapper.test.UsersMapper;
import com.zh.po.test.Users;
import com.zh.service.test.UsersService;

@Service("usersService")
@Transactional
public class UserServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	public List<Users> getUsersList() {
		// TODO Auto-generated method stub
		return this.usersMapper.getUsersList();
	}

}
