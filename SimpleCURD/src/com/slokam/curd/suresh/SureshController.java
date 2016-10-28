package com.slokam.curd.suresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.curd.suresh.pojo.PancardPojo;
import com.slokam.curd.suresh.service.SureshService;

@Controller
public class SureshController {
	@Autowired
	private SureshService sureshService;
	@RequestMapping("suresh.do")
	public ModelAndView firstPage(){
		PancardPojo pojo=new PancardPojo();
		
	ModelAndView mv=new ModelAndView();
	mv.addObject("pancard",pojo);
	mv.setViewName("suresh");
	return mv;
	
	}
	@RequestMapping("savePan.do")
	public ModelAndView savePan(PancardPojo pojo){
		sureshService.savePan(pojo);
		ModelAndView mv=new ModelAndView("suresh");
		mv.addObject("pancard",pojo);
		
		return mv;
		
		
	}
	

}
