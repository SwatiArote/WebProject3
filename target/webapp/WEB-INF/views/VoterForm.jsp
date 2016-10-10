<%--
  Created by IntelliJ IDEA.
  User: swati
  Date: 10/10/16
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voter Form</title>
</head>
<body>
<%--<form action="/votersSubmitted.html" th:object="${PersonVoter}" method="post">--%>

<form action="/votersSubmitted.html" method="post">
    <p>Voter Name:  <input type="text" name="name"></p>
    <p>Voter Age: <input type="text" name="age"></p>

    <input type="submit" value="Submit details">
</form>

</body>
</html>


<%--<table>--%>
    <%--<tr>--%>
        <%--<td>Name:</td>--%>
        <%--<td><input type="text" th:field="*{name}" /></td>--%>
        <%--<td th:if="${#fields.hasErrors('name')}" th:errors="*{name}">Name Error</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>
        <%--<td>Age:</td>--%>
        <%--<td><input type="text" th:field="*{age}" /></td>--%>
        <%--<td th:if="${#fields.hasErrors('age')}" th:errors="*{age}">Age Error</td>--%>
    <%--</tr>--%>
    <%--<tr>--%>

<%--</table>--%>
