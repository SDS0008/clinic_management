package com.example.Clinical.Sub_ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sub_contr {

	@RequestMapping("/usersa_ve")
	public ModelAndView user_save()
	{
		
		ModelAndView m1 = new ModelAndView("usersa_ve");
		return m1;
		
	}
	

	@RequestMapping("/fetch")
	public ModelAndView getalll()
	{
		
		ModelAndView m2= new ModelAndView("fetch");
		return m2;
		
	}
}
