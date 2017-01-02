package com.books;

import java.io.File;

public interface BookOperations {
	
	public void addBook(Book book,File file);
	public boolean deleteBook(Book book,File path);
	
	

}
