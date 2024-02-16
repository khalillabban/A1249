package com.library.items;

public class Media extends Item{
	private String type; // audio, video, interactive
	
	// Default constructor
	public Media() {
		super();
		this.type = "";
	}
	
	public Media(String id, String name, String author, int yearOfPublication, String type) {
		super(id, name, author, yearOfPublication);
		this.type = type;
	}
	
	public Media(Media other) {
		super(other);
		this.type = other.type;
	}
	
	// Accessor and mutator methods for type
	public String getType() {
		return type;
	}
	
	public void setType() {
		this.type = type;
	}
	
	// toString method to generate a string representation of Media
	public String toString() {
        return "Media{" +
                "id= '" + getId() + '\'' +
                ", name= '" + getName() + '\'' +
                ", author= '" + getAuthor() + '\'' +
                ", yearOfPublication= " + getYearOfPublication() +
                ", type= '" + type + '\'' +
                '}';
    }
	
	// equals() method to compare Media objects for equality
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Media)) return false;
		Media media = (Media)obj;
		return super.equals(obj)&& type == media.type;
	}
	
}
