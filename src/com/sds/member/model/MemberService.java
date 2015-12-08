package com.sds.member.model;

import java.util.List;

public interface MemberService {
	public List selectAll();
	public Member select(int member_id);
	public void insert(Member member);
	public void update(Member member);
	public void delete(int member_id);

}
