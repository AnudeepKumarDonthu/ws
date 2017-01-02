package com.books;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BookStore implements BookOperations {

	@Override
	public void addBook(Book book, File file) {
		try {

			System.out.println("Writing to file");
			FileInputStream fis = new FileInputStream(file);
			StringBuffer sb = new StringBuffer("");
			int ch;

			while ((ch = fis.read()) != -1) {
				System.out.println("" + ch);
				sb.append((char) ch);
			}
			System.out.println("content " + sb);
			FileOutputStream fos = new FileOutputStream(file);
			sb.append("\n" + book.getBookName() + "\t");
			sb.append(book.getBookType() + "\t");
			sb.append(book.getBookAuthor() + "\t");
			sb.append(book.getDate());
			String finalList = sb.toString();
			byte[] bytes = finalList.getBytes();
			fos.write(bytes);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean deleteBook(Book book, File file) {
		boolean found = false;
		StringBuffer newsb = new StringBuffer("");
		try {

			FileInputStream fis = new FileInputStream(file);
			StringBuffer sb = new StringBuffer("");

			int ch = 0;

			while ((ch = fis.read()) != -1) {

				sb.append((char) ch);
			}

			String finalList = sb.toString();
			String[] books = finalList.split("\n");
			for (String bk : books) {
				String[] bookDetails = bk.split("\t");
				if ((bookDetails[0].trim()).equals(book.getBookName())
						&& (bookDetails[1].trim()).equals(book.getBookAuthor())) {
					found = true;

				} else {
					newsb.append(bk + "\n");
				}
			}

			if (found) {
				FileOutputStream fos = new FileOutputStream(file);
				byte[] bytes = newsb.toString().getBytes();
				fos.write(bytes);

				return true;

			}
		} catch (FileNotFoundException e) {
			System.out.println("Required file is not exist In Local System");
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public String viewBooks(File file) {
		StringBuffer sb = new StringBuffer("");
		try {
			FileInputStream fis = new FileInputStream(file);

			int ch = 0;

			while ((ch = fis.read()) != -1) {

				sb.append((char) ch);
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	/*
	 * public static void main(String ar[]) { Book book = new Book(); Scanner s
	 * = new Scanner(System.in); System.out.println("please select One Option");
	 * System.out.println("1.Buy Book\n2.ReturnBook\n3.ViewBooks"); int option =
	 * s.nextInt();
	 * 
	 * BookStore bkstr = new BookStore();
	 * 
	 * if (option == 1) {
	 * 
	 * System.out.println("Please Enter Book Name"); book.setBookName(s.next());
	 * System.out.println("Please Enter Book Author");
	 * book.setBookAuthor(s.next()); bkstr.deleteBook(book);
	 * 
	 * } else if (option == 2) {
	 * 
	 * System.out.println("Please Enter Book Name"); book.setBookName(s.next());
	 * System.out.println("Please Enter Book Author");
	 * book.setBookAuthor(s.next());
	 * System.out.println("Please Enter Book type"); book.setBookType(s.next());
	 * 
	 * bkstr.addBook(book);
	 * 
	 * } else { bkstr.viewBooks(); }
	 * 
	 * }
	 * 
	 */}
