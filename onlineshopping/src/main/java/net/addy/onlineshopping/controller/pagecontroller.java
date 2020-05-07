package net.addy.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pagecontroller {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("hello", "welcome spring mvc");
		return mv;

	}
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value = "hello", required = false)String hello) {
//		if(hello == null) {
//			hello="hiiiiiii";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("hello", hello);
//		return mv;
//	}
//	
//	@RequestMapping(value = "/test/{hello}")
//	public ModelAndView test(@PathVariable("hello")String hello) {
//		if(hello == null) {
//			hello="hiiiiiii";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("hello", hello);
//		return mv;
//	}
//	

}
