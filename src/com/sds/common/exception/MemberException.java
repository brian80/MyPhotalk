package com.sds.common.exception;

public class MemberException extends RuntimeException{
	private String requestCode;

	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	
	public MemberException(String msg, Throwable e){
		super(msg, e);
	}
	public MemberException(String msg){
		super(msg);
	}
	
}












