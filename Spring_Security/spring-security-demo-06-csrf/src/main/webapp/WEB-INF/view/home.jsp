<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2> Hello There ! What's Up!!
</h2>

<form:form action="${pageContext.request.contextPath}/logout" method="POST">

	<input type="submit" value="LOG-OUT"/>

</form:form>
</body>
</html>