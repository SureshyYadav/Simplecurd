<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="loginProcess.do" method="post"> -->
		<tr> 
    <td align="center"><table class="login_table" border="0" cellpadding="0" cellspacing="0">
        <tbody><tr> 
          <td class="login_bar">Login</td>
        </tr>
        
        <tr> 
          <td class="login_con"> <table border="0" cellpadding="0" cellspacing="0" height="100%">
              <tbody><tr> 
                <td class="login_bg_left"><img src="../images/dot.gif" width="1px"></td>
                <td class="login_bg_right"><img src="../images/dot.gif" width="1px"></td>
              </tr>
              <tr> 
                <td class="login_left_bg_con">
					<table class="login_container" border="0" cellpadding="0" cellspacing="3">
                    <tbody>
                    <tr>
                    <td>Email or PhoneNumber</td>
                    </tr>
                    <tr> 
                      <td><input id="user" class="text" onfocus="this.className='textover'" onblur="this.className='text'" title="Enter Login ID" type="text">
                      </td>
                    </tr>
                    <tr> 
                      
                      &nbsp; &nbsp;<td><a href="#" class="link">Forgot Password</a> 
                    </tr>
                    <tr>
                    <td>Password</td>
                    </tr>
                    <tr> 
                      <td><input id="pwd" class="text" onfocus="this.className='textover'" onblur="this.className='text'" title="Enter Password" type="password">
                      </td>
                    </tr>
                    <!-- <tr>
                      <td>&nbsp;</td>
                      <td>(ex.:admin)</td>
                    </tr> -->
                    <tr> 
                      <td>&nbsp;</td>
                      <td class="login_button"> 
                        <input name="button" class="butt" onmouseover="this.className='buttOver'" onmouseout="this.className='butt'" value="Login" title="Login" onclick="login();" type="button"></td>
                    </tr>
                    <tr> 
                      <td>&nbsp;</td>
                    </tr>
                  </tbody></table>
				
				</td>
                <td class="login_bg_right_mid">&nbsp;</td>
              </tr>
              <tr>
                <td class="login_left_bg"><img src="../images/dot.gif" width="1px"></td>
                <td class="login_bg_right_dw"><img src="../images/dot.gif" width="1px"></td>
              </tr>
            </tbody></table></td>
        </tr>
      </tbody></table></td>
  </tr>
	<!-- </form> -->
</body>
</html>