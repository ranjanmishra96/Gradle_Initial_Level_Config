<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>Home page</h1>
<p>This is Home page.</p>
<!-- <p><a href="user-add-form.html">Creation of Users</a></p> -->
<p>
${message}<br/>
 <a href="${pageContext.request.contextPath}/US/addUser.html">Add new User</a><br/>
<br>
<%--
<a href="${pageContext.request.contextPath}/user/listOfUsers.html">Users list</a><br/>
<br>
<a href="${pageContext.request.contextPath}/task/addtask.html">Add new task</a><br/>
<br>
<a href="${pageContext.request.contextPath}/task/listOftasks.html">Task List</a><br/>
<br>
<a href="${pageContext.request.contextPath}/listOfUserTask/usertaskdetails.html">User's Task List</a><br/>
 --%>
</body>
</html>