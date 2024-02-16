package com.library.items;

public class Item {
	private String id;
	private String name;
	private String author;
	private int yearOfPublication;
	
	// Default constructor
	public Item() {
		this.id = "";
		this.name = "";
		this.author = "";
		this.yearOfPublication = 0;
	}
	
	// Parametrized constructor
	public Item(String id, String name, String author, int yearOfPublication) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}
	
	// Copy constructor
	public Item (Item other) {
		this.id = other.id;
		this.name = other.name;
		this.author = other.author;
		this.yearOfPublication = other.yearOfPublication;
	}
	
	// Getters and setters
	
	// Accessors
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	
	// Mutators
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYearOfPublication() {
		this.yearOfPublication = yearOfPublication;
	}
	
	// toString() Method
	public String toString() {
		return "Item{" +
                "id= '" + id + '\'' +
                ", name= '" + name + '\'' +
                ", author= '" + author + '\'' +
                ", yearOfPublication= " + yearOfPublication +
                '}';
	}
	
	// equals() Method
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		// Type cast the Object into an Item
		Item item = (Item) obj;
		// Compare attributes of objects and return result
		return yearOfPublication == item.yearOfPublication &&
				id.equals(item.id)&&
				name.equals(item.name) &&
				author.equals(item.author);
	}
	
}
