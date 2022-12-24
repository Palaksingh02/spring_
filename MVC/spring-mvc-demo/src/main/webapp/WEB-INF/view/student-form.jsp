<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>

	<form:form action ="processForm" modelAttribute="student">
		First Name<form:input path="firstName"/>
		<br><br>
		Last Name<form:input path="lastName"/>
		<br><br>
		<!--  Country<form:select path="country">
					A<form:option value="BR" label ="BRAZIL"/>
					B<form:option value="FR" label ="FRANCE"/>
					C<form:option value="DE" label ="GERMANY"/>
					D<form:option value="IN" label ="INDIA"/>
				</form:select>-->
		Country	<form:select path="country">
					<form:options items="${student.countryOptions}"/>
				</form:select>
		<br><br>
		Pick your favorite Languages 
		<br><br>
		<!--  Java<form:radiobutton path ="favoriteLanguage" value="JAVA"></form:radiobutton>
		C++<form:radiobutton path ="favoriteLanguage" value="C++"></form:radiobutton>
		C#<form:radiobutton path ="favoriteLanguage" value="C#"></form:radiobutton>
		Ruby<form:radiobutton path ="favoriteLanguage" value="RUBY"></form:radiobutton>-->
		
		<form:radiobuttons path="favoriteLanguage" items="${student.languageOptions}"/>
		<br><br>
			<form:checkbox path="operatingSystem" value="WINDOWS"/>MS Windows
			<form:checkbox path="operatingSystem" value="LINUX"/>Linux
			<form:checkbox path="operatingSystem" value="MACOS"/>MAC OS
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form >
</body>
</html>