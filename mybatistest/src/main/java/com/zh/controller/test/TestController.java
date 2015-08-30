package com.zh.controller.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zh.pojo.test.Users;
import com.zh.service.test.UsersService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UsersService usersService;
	
	private static Logger logger = Logger.getLogger(TestController.class);  

	@RequestMapping("/hello.do")
	public String test(Model model) {
		System.out.println("init test/hello.do");

		List<Users> list = this.usersService.getUsersList();

		model.addAttribute("list", list);
		
        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message.");  
        
		return "test/list";
	}

}
