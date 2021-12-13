<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 선언문 -->
<%! 
String name = "윤상현" ;
public String getName(){
	return name;
}
%>
<!-- 스크립트릿 -->
<%
String name2 = "윤상현";
String age = request.getParameter("age");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿 연습</title>
</head>
<body><!-- 표현식 -->
<h1>안녕하세요 <%=name%>님!!</h1><br>
<p>나이는 <%=age%>살 입니다!!</p><br>
<p><%=name2 %></p>
</body>
</html>