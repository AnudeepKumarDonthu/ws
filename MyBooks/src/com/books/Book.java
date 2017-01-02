package com.books;

import java.util.Date;

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private Date date;
	private String bookType;
	private String contentFilePath;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Date getDate() {
		return new Date();
	}
	public void setDate(Date date){
		this.date=date;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getContentFilePath() {
		return contentFilePath;
	}
	public void setContentFilePath(String contentFilePath) {
		this.contentFilePath = contentFilePath;
	}
	
	
	

}
