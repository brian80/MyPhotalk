<%@ page contentType="text/json; charset=UTF-8"%>
<%
	String resultData=(String)request.getAttribute("resultData");

	out.print("{");
	out.print("\"requestCode\":\"insert\",");
	out.print("\"resultData\" : \""+resultData+"\"");
	out.print("}");
%>