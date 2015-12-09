package com.sds.member.model;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.sds.common.exception.MemberException;

public class MemberDAOMybatis extends SqlSessionDaoSupport implements MemberDAO{

	@Override
	public List selectAll() {
		return null;
	}
	
	@Override
	public Member select(int member_id) {
		return null;
	}

	public void isMember(Member member) throws MemberException{		
		try {
			Object obj=getSqlSession().selectOne("Member.isMember", member);
			if(obj !=null){
				MemberException memberException = new MemberException("이미 등록된 회원입니다.");
				throw memberException;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);			
		}		
	}
	
	@Override
	public void insert(Member member) throws MemberException{
		try {
			int result=getSqlSession().insert("Member.insert", member);
			if(result==0){
				MemberException memberException = new MemberException("등록되지 않았습니다..");
				memberException.setRequestCode("insert");
				throw memberException;
			}
		} catch (Exception e) {
			throw new MemberException("데이터베이스에 문제가 있음",e);	
		}
	}

	@Override
	public void update(Member member) {
		
	}

	@Override
	public void delete(int member_id) {
		// TODO Auto-generated method stub
		
	}
	
}
