<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- This is the tag which provides all the special tags which generate the html for us -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> <!-- This tag provides  -->
<!DOCTYPE HTML>
<html>
<body>
The Confirmed Customer's First Name and Last Name : ${customer.firstName} ${customer.lastName} 
Number of free-passes : ${customer.freePasses}
</body>
</html>