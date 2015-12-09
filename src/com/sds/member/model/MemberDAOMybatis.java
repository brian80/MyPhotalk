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
				MemberException memberException = new MemberException("�̹� ��ϵ� ȸ���Դϴ�.");
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
				MemberException memberException = new MemberException("��ϵ��� �ʾҽ��ϴ�..");
				memberException.setRequestCode("insert");
				throw memberException;
			}
		} catch (Exception e) {
			throw new MemberException("�����ͺ��̽��� ������ ����",e);	
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
