<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Track items</title>
</head>
<body>

<form:form method ="get" action ="/track/add" modelAttribute="form"> 
    <input type="input" name="item"> 
    <input type="input" name="cost"> 
     <input type="input" name="date"> 
    <input type="input" name="note"> 
    <input type="submit"> 

</form:form> 

</body>
</html>