package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloController {
	@RequestMapping(value="/greeting", method = RequestMethod.GET)
     public String sayHello(Model model)
	{
		System.out.println("HelloController.sayHello()");
		model.addAttribute("greeting", "hello world");
		return "hello";
	}
}
