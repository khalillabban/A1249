package com.library.items;

public class Journal extends Item {
	private int volumeNumber;

	// Default constructor
	public Journal() {
		super();
		this.volumeNumber = 0;
	}
	
	// Parametrized constructor
	public Journal(String id, String name, String author, int yearOfPublication, int volumeNumber) {
		super(id, name, author, yearOfPublication);
		this.volumeNumber = volumeNumber;
	}
	
	// Copy constructor
	public Journal (Journal other) {
		super(other);
		this.volumeNumber = other.volumeNumber;
	}
	
	// Accessor and mutator methods for volumeNumber
	public int getVolumeNumber() {
		return volumeNumber;
	}
	
	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	// toString method to generate a string representation of the Journal
	public String toString() {
		return "Item{" +
                "id= '" + getId() + '\'' +
                ", name= '" + getName() + '\'' +
                ", author= '" + getAuthor() + '\'' +
                ", yearOfPublication= " + getYearOfPublication() +
                ". volumeNumber= " + volumeNumber +
                '}';
	}
	
	// equals() method to compare Journal objects for equality
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Journal)) return false;
		Journal journal = (Journal)obj;
		return super.equals(obj)&& volumeNumber == journal.volumeNumber;
	}
}
