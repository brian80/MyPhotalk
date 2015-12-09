package com.sds.member.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sds.common.exception.MemberException;

public class MemberServiceMybatis implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member select(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Member member) throws MemberException{
		((MemberDAOMybatis)memberDAO).isMember(member);
		memberDAO.insert(member);		
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int member_id) {
		// TODO Auto-generated method stub
		
	}
	
}
