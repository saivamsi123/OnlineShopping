<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<style type="text/css">
  <%@include file="styles.css" %>
</style>

<!DOCTYPE html>
<html>
<head>
<title>SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>SignUp Form</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="CustomerControllerDB" method="post">
				    <input class="text" type="text" name="id" placeholder="Customer code" required="">
				    <br/>
					<input class="text" type="text" name="Username" placeholder="Username" required="">
					<br/>
					<input class="text" type="password" name="password" placeholder="Password" required="">
					<br/>
					<input class="text email" type="email" name="email" placeholder="Email" required="">
					<br/>
					<input class="text" type="text" name="phoneNo" placeholder="Phone Number" required="">
					<br/>
					<input class="text" type="text" name="landmark" placeholder="Landmark" required="">
					<br/>
					<input class="text" type="text" name="address" placeholder="Address" required="">
					<br/>
					<input class="text" type="text" name="pinno" placeholder="Pin No" required="">
					<br/>
					<input class="text" type="text" name="city" placeholder="City" required="">
					<br/>
					<input class="text w3lpass" type="password" name="password" placeholder="Confirm Password" required="">
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" name="submit" value="SIGNUP">
				</form>
				<p>Don't have an Account? <a href="user_login.jsp"> Login Now!</a></p>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>� 2019 VamsiDesign Signup Form. All rights reserved | Design by <a href="https://techgiant.com/" target="_blank">Vamsi</a></p>
		</div>
		<!-- //copyright -->
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>