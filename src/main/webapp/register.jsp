<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="rgb" class="beans.RegisterBeans"></jsp:useBean>
<jsp:useBean id="dao" class="Dao.RegisterDao"></jsp:useBean>
<jsp:setProperty property="*" name="rgb"/>

<%

if(dao.equals("success")){
	out.print("Registration Success");
}
else{
	out.print("Unsuccess");
}
%>

</body>
</html>