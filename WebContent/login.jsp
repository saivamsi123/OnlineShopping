<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<style type="text/css">
  <%@include file="loginPage.css" %>
</style>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="login">
  <div class="heading">
    <h2>Sign in</h2>
    <form action="CustomerControllerDB" method="get">
      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-user"></i></span>
        <input type="text" class="form-control" placeholder="Username or email" name="username">
      </div>
      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
        <input type="password" class="form-control" placeholder="Password" name="password">
      </div>
      <input type="hidden" name="action" value="login">
      <button type="submit" name="submit" value="submit" class="float">Login</button>
    </form>
  </div>
 </div>
 
</body>
</html>