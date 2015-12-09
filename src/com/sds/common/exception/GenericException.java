package com.sds.common.exception;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;

public class GenericException extends RuntimeException{
	
	private String requestCode;
	
	
	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public GenericException(String msg) {
		super(msg);
	}
	
	public GenericException(Throwable e, String msg) {
		super(msg, e);	
	}
	
}