<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/registration.css" />
</head>
<body>
<form action="action_page.php">
<div  calss="contianer">

<div class="imgcontainer"  style="float:right">
    <img src="images/java1.jpg" alt="Avatar" class="avatar">
  </div>
<frameset>
 <div class="leftcontainer" style="margin-left:40px "> 
 
    <label for="fname"><b>YourName</b></label><br>
    <input type="text" id="fname" name="name" placeholder="enter your name" required><br>
  
	<label for="email"><b>Email</b></label><br>
    <input type="email" id="email" name="email" placeholder="info@java.com" required><br>
	
	 <label for="lname"><b>Password</b></label><br>
    <input type="text" id="lname" name="lastname"  placeholder="enter your Password" required><br>
	
	 <label for="lname"><b>VerifyPassword</b></label>
    <input type="text" id="lname" name="lastname"  placeholder="Verify Your Password" required><br>
	
	<label for="lname"><b>Mobile Number</b></label>
    <input type="text" id="number" name="number"  placeholder="123456789" required><br>
	
	<label for="lname"><b>Gender</b></label>
    <input type="radio" id="male" name="gender" value="male" required>Male
	<input type="radio" id="male" name="gender" value="female" required>Female<br>

    <label for="country"><b>State</b></label><br>
    <select id="State" name="State">
      <option value="Hyderabad">Hyderabad</option>
      <option value="Vijayawada">Vijayawada</option>
      <option value="Mumbai">Mumbai</option>
	  <option value="Delhi">Delhi</option>
	  <option value="Chennai">Chennai</option>
	  <option value="Bangalore">Bangalore</option>
    </select><br>
	</div>
	</frameset>
  
    <button type="submit">Submit</button>
	 <div class="container" style="background-color:#f1f1f1">
        <span class="psw">Already have account <a href="dcmds.do">Login?</a></span>
  </div>
  
</div>
</form>

</body>
</html>