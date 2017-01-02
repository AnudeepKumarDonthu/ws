<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function validate(){
	
	if(document.getElementById("name").value.trim()==""){
		alert("name shouldNot be Empty");
		return false;
	}
if(document.getElementById("author").value.trim()==""){
	alert("Author should not be empty");
		return false;
	}
}
</script>
</head>
<body bgcolor=lightblue>

	<form action="mybook">

		<font size=4px color=green>Return Book:</font> <br />
		<br/>
		<table>
			<tr>
				<td>Book Name</td>
				<td><input type="text" name="BookName"  id="name" /></td>
			</tr>
			<tr>
				<td>Book Type :</td>
				<td> <input type="radio" name="BookType" id="story" value="story" checked />&nbsp;StoryBooks</td>
				<td><input type="radio" name="BookType" id="study"  value="study"/>&nbsp;StudyBooks </td>
			</tr>
			<tr>
				<td>Book Author</td>
				<td><input type="text" name="BookAuthor" id="author" /></td>
			</tr>

		</table>
		<input type="submit" value="ReturnBook" name="submit" style="background:whitesmoke" onclick="return validate()" />

	</form>

</body>
</html>