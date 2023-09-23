<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead</title>
</head>
<body>
<h2>leading</h2>
<form action="saveLead" method="post">
<pre>
firstname<input type="text" name="firstname"/>
lastname<input type="text" name="lastname"/>
email<input type="text" name="email"/>
mobile<input type="text" name="mobile"/>
<input type="submit" value="save"/>
</pre>
</form>
${mdg}
</body>
</html>