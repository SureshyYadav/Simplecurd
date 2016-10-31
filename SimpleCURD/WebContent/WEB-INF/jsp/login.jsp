<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />

</head>
<body >

 <form action="java">
  <div class="imgcontainer" style="float:center">
    <img src="images/java2.jpg" alt="Java" class="avatar">
  </div>

  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required><br>
	<span class="psw">Forgot <a href="#">password?</a></span><br>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password"  name="psw" required><br>

    <button type="submit" class="psw" >Login</button><br>
    <input type="checkbox" checked="checked"> Remember me
  </div>
<div class="container" style="background-color:#f1f1f1">
        <span class="psw">Create Your Account <a href="dcm.do">Register?</a></span>
  </div>
  
    
    
  
</form>

</body>
</html>