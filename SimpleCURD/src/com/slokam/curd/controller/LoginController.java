package com.slokam.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.curd.interfaces.IPersonService;
import com.slokam.curd.pojo.Search;

@Controller
public class LoginController {
	@Autowired
	private IPersonService service;
	@RequestMapping("gotoLogin.do")
	public ModelAndView gotoLogin(){
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("search.do")
	public ModelAndView displaySearchPage(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("displaySearch");
		mv.addObject("searchPojo",new Search());
		return mv;
}
	@RequestMapping("get.do")
	public ModelAndView searchPage(Search pojo){
		ModelAndView mv=new ModelAndView();
		List<Object[]> list=service.search(pojo);
		mv.setViewName("displaySearch");
		mv.addObject("searchPojo",new Search());
		mv.addObject("list",list);
		return mv;
}
	
}
