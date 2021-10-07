<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("name", "윤상현");
request.setAttribute("address", "대전 동구");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 객체전달 테스트</title>
</head>
<body>

<%
RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
dispatch.forward(request, response);
%>
</body>
</html>