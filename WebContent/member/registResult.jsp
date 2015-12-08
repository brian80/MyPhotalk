<%@ page contentType="text/json; charset=UTF-8"%>
<%
	String requestCode=(String)request.getAttribute("requestCode");
	String resultData=(String)request.getAttribute("resultData");

	out.print("{");
	out.print("\"requestCode\" : \""+requestCode+"\",");
	out.print("\"resultData\" : \""+resultData+"\"");
	out.print("}");
%>