<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="false" %>
<spring:eval expression="@cofigProperties['main.path']" var="mainPath"/>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
	window.opener.userForm.ci_code.value = ${code};
	window.opener.userForm.action="${mainPath}/user/signUp"
	window.opener.userForm.submit();
	window.close();		
</script> 	
</head>
<body>
</body>
</html>