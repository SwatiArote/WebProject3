<%--
  Created by IntelliJ IDEA.
  User: swati
  Date: 9/10/16
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h1>Please Fill following Information</h1>

<form action="/submitForm.html" method="post">
    <p>Student Name:<input type="text" name="studentName"></p>
    <p>Course of Interest:<input type="text" name="courseChoice"></p>
    <input type="submit" value="submit your choice">
</form>

</body>
</html>
