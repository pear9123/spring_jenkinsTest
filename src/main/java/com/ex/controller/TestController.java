package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("msg", "TEST12345");
		return "test";
	}
	
	@RequestMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("msg", "D2Model");
		return "test2";
	}
}
