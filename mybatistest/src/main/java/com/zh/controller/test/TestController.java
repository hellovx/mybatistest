package com.zh.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/hello.do")
	public String test(Model model,@RequestParam("username") String name){
		System.out.println("init test/hello.do");
		System.out.println("name:"+name);
		model.addAttribute("name", name);
		return "list";
	}

}
