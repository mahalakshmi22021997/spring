package com.cg.intro;
import javax.annotation.*;

public class Book {
	private String isbn;
	private String year;
	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setUp() {
		System.out.println("hi this is setup method");
	}

	public void cleanUp() {
		System.out.println("hii this is getup method");
	}

	@PostConstruct
	public void customInit() {
		System.out.println("hii this is customInit method");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("hii this is customdestroy method");
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author
				+ "]";
	}

	
}
