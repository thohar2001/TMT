package se.yrgo.maven_addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> contacts;
	
	public AddressBook() {
		this.contacts = new ArrayList<>();
	}
	
	public AddressBook(List<Contact> contacts) {
		this.contacts = new ArrayList<>(contacts);
	}
	
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	
    public void removeContact(Contact contact) {
    	this.contacts.remove(contacts.indexOf(contact));
    }
    
}