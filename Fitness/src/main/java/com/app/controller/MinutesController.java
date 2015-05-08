package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		System.out.println("Minutes"+exercise.getMinutes());
		return "addMinutes.html";  //bypassing view resolver
	}
	
	
//	@RequestMapping(value="/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
//		System.out.println("Minutes---2"+exercise.getMinutes());
//		return "addMinutes";
//	}

}
