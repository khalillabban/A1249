package com.library.clients;

public class Client {
	private String id;
	private String name;
	String phoneNumber;
	private String emailAddress;
	
	// Default constructor
	public Client() {
		this.id = "";
		this.name = "";
		this.phoneNumber = "";
		this.emailAddress = "";
	}
	
	// Parametrized constructor
	public Client(String id, String name, String phoneNumber, String emailAddress) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	// Copy constructor
	public Client(Client other) {
		this.id = other.id;
		this.name = other.name;
		this.phoneNumber = other.phoneNumber;
		this.emailAddress = other.emailAddress;
	}
	
	// Accessor and mutator methods
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public  String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	// toString() method to generate a string representation of Client
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
    
    // equals() method to compare Client objects for equality
    public boolean equals(Object obj) {
    	if(this == obj) return true;
    	if(!(obj instanceof Client)) return false;
    	Client client = (Client)obj;
    	return id.equals(client.id)&&
    			name.equals(client.name) &&
    			phoneNumber.equals(client.phoneNumber)&&
    			emailAddress.equals(client.emailAddress);
    }
}
