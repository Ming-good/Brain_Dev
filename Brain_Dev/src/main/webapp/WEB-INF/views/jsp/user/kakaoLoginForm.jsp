<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
	opener.userForm.ci_code.value = "${ciCode}";
	window.close();		
</script> 	
</head>
<body>
</body>
</html>