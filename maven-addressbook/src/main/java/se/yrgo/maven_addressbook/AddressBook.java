package se.yrgo.maven_addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> contacts;
	
	public AddressBook() {
		this.contacts = new ArrayList<>();
	}
	
	/**
	 * Constructor that takes a List of contacts
	 * @param List of contacts
	 */
	public AddressBook(List<Contact> contacts) {
		this.contacts = new ArrayList<>(contacts);
	}
	
	/**
	 * @return the number of contacts.
	 */
	public int getNumberOfContacts() {
		return contacts.size();
	}
	
	/**
	 * Add a new contact to the List of contacts.
	 * @param contact
	 */
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	
	/**
	 * Removes a specific contact from the List of contacts.
	 * @param contact
	 */
    public void removeContact(Contact contact) {
    	this.contacts.remove(contacts.indexOf(contact));
    }
    
    /**
     * Finds a contact by Contact email. 
     * @param email
     * @return Contact
     * @throws Exception when no Contact object is found
     */
    public Contact findContact(String email) throws Exception {
    	for(int i=0; i<contacts.size(); i++) {
    		if (contacts.get(i).getEmail().equals(email)) {
    			return contacts.get(i);
    		}
    	}
    	throw new Exception("Contact with email: " + email + " not found");
    }
    
}
