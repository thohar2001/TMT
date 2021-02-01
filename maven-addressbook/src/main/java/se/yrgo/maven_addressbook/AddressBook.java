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
	
	public int getNumberOfContacts() {
		return contacts.size();
	}
	
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	
    public void removeContact(Contact contact) {
    	this.contacts.remove(contacts.indexOf(contact));
    }
    
    public Contact findContact(String email) throws Exception {
    	for(int i=0; i<contacts.size(); i++) {
    		if (contacts.get(i).getEmail().equals(email)) {
    			return contacts.get(i);
    		}
    	}
    	throw new Exception("Contact with email: " + email + " not found");
    }
    
}
