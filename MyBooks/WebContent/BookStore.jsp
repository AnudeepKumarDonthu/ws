<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To BookStore</title>
</head>
<body>
	<table bgcolor="lightblue" width=100% height=10%>
		<tr>
			<td align=center><font size=5px>My BookStore</font></td>
		</tr>
	</table>
	<marquee direction=right>
		<font color="lightRed">please select one option</font>
	</marquee>
	<br />
	<table width=100%>

		<tr>
			<td width=70></td>
			<td align=left><font color="green">Menu:</font></td>

			<td width=400></td>
		</tr>
		<tr>
			<td width=100></td>

			<td align=center><a href="BuyBook.jsp">BuyBook</a></td>
			<td width=400></td>
		</tr>
		<tr>
			<td width=100></td>

			<td align=center><a href="ReturnBook.jsp">ReturnBook</a></td>
			<td width=400></td>
		</tr>
		
		<tr>
			<td width=100></td>

			<td align=center><a href="<%=request.getContextPath() %>/ViewServlet">ViewBooks</a></td>
			<td width=400></td>
		</tr>
	</table>
	<br />
	<br />

</body>
</html>