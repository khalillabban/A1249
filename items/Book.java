package com.library.items;

public class Book extends Item {
	private int numberOfPages;
	
	// Default constructor
	public Book() {
		super();
		this.numberOfPages = 0;
	}
	
	// Parametrized constructor
	public Book(String id, String name, String author, int yearOfPublication, int numberOfPages) {
		super(id, name, author, yearOfPublication);
		this.numberOfPages = numberOfPages;
	}
	
	// Copy constructor
	public Book (Book other) {
		super(other);
		this.numberOfPages = other.numberOfPages;
	}
	
	// Accessor and mutator methods for numberOfPages
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	// toString method to generate a string representation of Book
	public String toString() {
	        return "Media{" +
	                "id= '" + getId() + '\'' +
	                ", name= '" + getName() + '\'' +
	                ", author= '" + getAuthor() + '\'' +
	                ", yearOfPublication= " + getYearOfPublication() +
	                ", type= '" + numberOfPages + '\'' +
	                '}';
	    }
		
	// equals() method to compare Book objects for equality
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if (!(obj instanceof Book)) return false;
		Book book = (Book)obj;
		return super.equals(obj) && numberOfPages == book.numberOfPages;
	}
}
