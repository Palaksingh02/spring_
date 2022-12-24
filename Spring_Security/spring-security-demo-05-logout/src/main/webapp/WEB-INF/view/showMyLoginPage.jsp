<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Custom Login Form</title>
	<style>
		.failed{
			color:red;
		}
	</style>
</head>
<body>
	<h2>My Custom Login Page</h2>
	
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
		<!-- Checking for login error -->
		<c:if test="${param.error!=null}">
			<i class="failed">Sorry you have entered wrong login info</i>
		</c:if>
		<p>
		User Name : <input type="text" name="username"/>
		</p>
		<p>
		Password : <input type="password" name="password"/>
		</p>
		<input type="submit" value="LOGIN"/>
	</form:form>
	
</body>
</html>