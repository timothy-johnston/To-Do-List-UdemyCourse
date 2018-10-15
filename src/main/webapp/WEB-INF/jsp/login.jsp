<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

	<h3>Login</h3>
	<form method="post">
		<div>Name:</div>
		<div><input type = "text" name="name"/></div>
		<div>Password:</div> 
		<div><input type="password" name="password" /></div>
		<div>${message}</div>
		<input type="submit"/>
	</form>

<%@ include file="common/footer.jspf"%>
