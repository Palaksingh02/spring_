<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- This is the tag which provides all the special tags which generate the html for us -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> <!-- This tag provides  -->
<!DOCTYPE HTML>
<html>
<body>
The Confirmed Student's First Name and Last Name : ${student.firstName} ${student.lastName} 
Country : ${student.country}
Favorite Language : ${student.favoriteLanguage}
Operating System:
<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
		<li>${temp}</li>
	</c:forEach>
</ul>
</body>
</html>