<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	request.setAttribute("path", path);
%>
</head>
<body>

<table border="1" width="80%" align="center"> 
 <tr>
   <td align = "center">序号：</td>
   <td align = "center">id</td>
   <td align = "center">name:</td>
   <td align = "center">age：</td>
   <td align = "center">address：</td>
  </tr>
  
  <c:forEach items="${list}" var="userinfo" varStatus="var">
  <tr>
   <td align = "center">${var.index+1}:</td>
   <td align = "center">${userinfo.uid}</td>
   <td align = "center">${userinfo.name}</td>
   <td align = "center">${userinfo.age}</td>
   <td align = "center">${userinfo.address}</td>
  </c:forEach>
  
  </tr>　　
</table>
	

</body>
</html>