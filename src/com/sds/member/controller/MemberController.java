package com.sds.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sds.common.exception.MemberException;
import com.sds.member.model.Member;
import com.sds.member.model.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/member/regist.do")
	public ModelAndView insert(Member member){
		System.out.println("email, pwd"+member.getEmail()+", "+member.getPwd());
		memberService.insert(member);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("requestCode", "insert");
		mav.addObject("resultData", "success");
		mav.setViewName("member/registResult");		
		return mav;
	}

	@ExceptionHandler(MemberException.class)
	public ModelAndView handleException(MemberException e){
		ModelAndView mav = new ModelAndView("member/errorResult");
		mav.addObject("error", e);
		return mav;
	}

}










