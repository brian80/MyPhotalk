package com.sds.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sds.member.model.Member;

@Controller
public class MemberController {
	
	@RequestMapping("/member/regist.do")
	public ModelAndView insert(Member member){
		System.out.println("email, pwd"+member.getEmail()+", "+member.getPwd());
		ModelAndView mav = new ModelAndView();
		mav.addObject("requestCode", "delete");
		mav.addObject("resultData", "success");
		mav.setViewName("member/registResult");		
		return mav;
	}


}