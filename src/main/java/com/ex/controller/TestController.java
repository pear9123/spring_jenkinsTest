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
	
	@RequestMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("msg", "T3");
		return "test2";
	}
	
	@RequestMapping("/test4")
	public String test4(Model model) {
		model.addAttribute("msg", "T4");
		return "test2";
	}
	
	@RequestMapping("/test5")
	public String test5(Model model) {
		model.addAttribute("msg", "T5");
		return "test2";
	}
	
	@RequestMapping("/test6")
	public String test6(Model model) {
		model.addAttribute("msg", "T6");
		return "test2";
	}
}
