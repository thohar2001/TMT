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
	 * 
	 * @param contacts List of contacts
	 */
	public AddressBook(List<Contact> contacts) {
		this.contacts = new ArrayList<>(contacts);
	}
	
	/**
	 * 
	 * Returns the number of contacts in addressbook.
	 * 
	 * @return Number of contacts in addressbook.
	 */
	public int getNumberOfContacts() {
		return contacts.size();
	}
	
	/**
	 * Add a new contact to the List of contacts.
	 * 
	 * @param contact Contact to add.
	 */
	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
	
	/**
	 * Removes a specific contact from the List of contacts.
	 * 
	 * @param contact Contact to remove.
	 */
    public void removeContact(Contact contact) {
    	this.contacts.remove(contacts.indexOf(contact));
    }
    
    /**
     * Finds a contact by Contact email. 
     * 
     * @param email E-mail address of contact.
     * @return Contact Contact that matches the e-mail address given as parameter.
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