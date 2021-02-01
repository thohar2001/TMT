package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddressBook {
	private AddressBook ab;
	private Contact testContact;
	
	public TestAddressBook() {
		ab = new AddressBook();
		testContact = new Contact("Jonas", "Karlsson", 18, "Gamla Gatan 4", 12345, "jonas.karlsson@gmail.com");
		ab.addContact(testContact);
	}

	@Test
	public void testGetNumberOfContacts() {
		assertEquals(ab.getNumberOfContacts(), 1);
	}
	
	@Test
	public void testAddContact() {
		Contact contact = new Contact("Karl", "Jonasson", 35, "Nya Vägen 3", 23456, "karl.jonasson@gmail.com");
		ab.addContact(contact);
		assertEquals(ab.getNumberOfContacts(), 2);
	}
	
	@Test
	public void testRemoveContact() {
		ab.removeContact(testContact);
		assertEquals(ab.getNumberOfContacts(), 0);
	}
	
	@Test
	public void testFindContact() throws Exception {
		assertTrue(ab.findContact("jonas.karlsson@gmail.com").equals(testContact));
	}

}
