<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>  
<html>
<body>
<h2> Hello There ! What's Up!!
</h2>
<p>
 User : <security:authentication property="principal.username"/>
 <br><br>
 Roles : <security:authentication property="principal.authorities"/>
</p>
</security>
<form:form action="${pageContext.request.contextPath}/logout" method="POST">

	<input type="submit" value="LOG-OUT"/>

</form:form>
</body>
</html>