<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
        <%@ page import="com.books.Book" %>
        <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=lightblue>

<% String message=(String)request.getAttribute("message");
List<Book> list=(ArrayList)request.getAttribute("bookList");

String str=(String)request.getAttribute("listString");

if(message==null){
	message="Below Showing are Available Books";
}
if(list==null){
	list=new ArrayList<Book>();
}

%>

<marquee ><%=message %></marquee>
<font color=green> Available Books</font>
<table border=2 cellspacing=0 cellpadding=0 width=100%>
<tr>
<th align=center>BookName</th>
<th align=center>BookAuthor</th>
<th align=center>BookType</th>
</tr>

<%-- <% for(Book book:list){
%>
<tr>
<td><%book.getBookName(); %></td>
<td><%book.getBookAuthor(); %></td>
<td><%book.getBookType(); %>d</td>

</tr>
<%} %> --%>
 <% String[] books = str.split("\n");
	System.out.println(books.length);
	for (int i = 1; i < books.length; i++) {
		
		String[] bookDetails = books[i].split("\t");

	
%>
<tr>
<td align=center><%=bookDetails[0] %></td>
<td align=center><%=bookDetails[1] %></td>
<td align=center><%=bookDetails[2] %></td>

</tr>
<%} %> 
</table>

</body>
</html>