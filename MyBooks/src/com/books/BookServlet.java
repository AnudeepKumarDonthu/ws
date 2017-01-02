package com.books;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookServlet extends HttpServlet {

	BookStore bkstr = new BookStore();
	Book book = new Book();
	Random r = new Random();

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("welcome");
String path=req.getServletContext().getRealPath("/WEB-INF/mybook.txt");

System.out.println("path issss"+path);

File file=new File(path);
System.out.println("reached");
		Integer pages = 0;
		Integer price = 0;
		String message = "";

		String action = req.getParameter("submit");
		String bookType = req.getParameter("BookType");

		if ("Buy/Rent".equals(action.trim())) {
			String bORr = req.getParameter("BuyRent");
			if (bORr == "buy") {

				StudyBooks book = new StudyBooks();
				price = r.nextInt(1000) + 50;
				pages = r.nextInt(500) + 50;
				book.setPrice(price.toString());
				book.setNumberOfPages(pages.toString());
				book.setBookName(req.getParameter("BookName"));
				book.setBookAuthor(req.getParameter("BookAuthor"));
				book.setBookType(req.getParameter("BookType"));
				
				if(bkstr.deleteBook(book,file))
				message = "Successfully Purchased Book for " + price + " USD";
				else{
					message="Book Not Found";
				}

				

			} else {
				book.setBookName(req.getParameter("BookName"));
				book.setBookAuthor(req.getParameter("BookAuthor"));
				book.setBookType(req.getParameter("BookType"));
				if(bkstr.deleteBook(book,file))
				message = "Approved for Rent";
				else{
					message="Book Not Found";
				}

			}
		} else if("ReturnBook".equals(action.trim())){

			book.setBookName(req.getParameter("BookName"));
			book.setBookAuthor(req.getParameter("BookAuthor"));
			book.setBookType(req.getParameter("BookType"));
			bkstr.addBook(book,file);
			
			message="book Added Successfully";

		}
		String s = bkstr.viewBooks(file);

		req.setAttribute("message", message);
		//req.setAttribute("bookList", makeList(s));
		req.setAttribute("listString", s);
		
RequestDispatcher reqd=req.getRequestDispatcher("View.jsp");

reqd.forward(req, resp);
		//resp.sendRedirect("View.jsp");

	}
/*
	private List<Book> makeList(String sb) {
		
		List<Book> bookList = new ArrayList<Book>();

		String[] books = sb.split("\n");
		System.out.println(books.length);
		for (int i = 1; i < books.length; i++) {
			Book book = new Book();
			System.out.println("old" + books[i]);
			String[] bookDetails = books[i].split("\t");
			System.out.println("new" + bookDetails[0]);

			book.setBookName(bookDetails[0]);
			book.setBookAuthor(bookDetails[1]);
			book.setBookType(bookDetails[2]);
			bookList.add(book);
		}

		

		
		 * Iterator<Book> it = bookList.iterator(); while (it.hasNext()) { Book
		 * bk = it.next(); }
		 
		System.out.println("size in servlet"+bookList.size());
		return bookList;

	}

*/}
