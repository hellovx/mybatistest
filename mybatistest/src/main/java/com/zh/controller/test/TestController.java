package com.zh.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zh.po.test.Users;
import com.zh.service.test.UsersService;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/hello.do")
	public String test(Model model,@RequestParam("username") String name){
		System.out.println("init test/hello.do");
		System.out.println("name:"+name);
		
		List<Users> list=this.usersService.getUsersList();
		
		
		model.addAttribute("name", name);
		return "list";
	}

}
