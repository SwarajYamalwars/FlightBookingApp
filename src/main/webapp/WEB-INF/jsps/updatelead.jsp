<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updateLead</title>
</head>
<body>
<h2>leads</h2>
<form action="updates" method="post">
<pre>
<input type="hidden" name="id" value="${lead.id}"/>
firstname<input type="text" name="firstname" value="${lead.firstname }"/>
lastname<input type="text" name="lastname" value="${lead.lastname }"/>
email<input type="text" name="email" value="${lead.email}"/>
mobile<input type="text" name="mobile" value="${lead.mobile}"/>
<input type="submit" value="update"/>
</pre>
</form>

</body>
</html>