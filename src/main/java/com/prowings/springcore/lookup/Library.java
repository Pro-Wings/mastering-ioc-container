package com.prowings.springcore.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class Library {

	private int id;
	
	@Autowired
	private Book book;

	public Library() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Book getBook() {
//		return book;
//	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Lookup
	public abstract Book getBook();
	
}
