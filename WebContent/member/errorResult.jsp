<%@page import="com.sds.common.exception.MemberException"%>
<%@ page contentType="text/json; charset=UTF-8"%>
<%
	MemberException error=(MemberException)request.getAttribute("error");
	
	String requestCode=error.getRequestCode();
	String resultData=error.getMessage();

	out.print("{");
	out.print("\"requestCode\" : \""+requestCode+"\",");
	out.print("\"resultData\" : \""+resultData+"\"");
	out.print("}");
%>