package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContact {

	private final String firstname = "Bo";
	private final String lastname = "Andersson";
	private final int age = 35;
	private final String address = "Dirty Boulevard";
	private final int telephone = 555164200;
	private final String email = "email@andersson.com";
	
	
	@Test
	public void testGetFirstname() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(firstname, c.getFirstName());
	}

	@Test
	public void testGetLastname() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(lastname, c.getLastName());
	}
	
	@Test
	public void testGetAge() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(age, c.getAge());
	}	
	
	@Test
	public void testGetAddress() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(address, c.getAddress());
	}	

	@Test
	public void testGetPhoneNumber() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(telephone, c.getPhoneNumber());
	}
	
	@Test
	public void testGetEmail() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		assertEquals(email, c.getEmail());
	}
	
	@Test
	public void test2EqualContact() {
		Contact c1 = new Contact(firstname, lastname, age, address, telephone, email);
		Contact c2 = new Contact(firstname, lastname, age, address, telephone, email);
		
		assertEquals(c1, c2);
	}

	@Test
	public void test2NonEqualContact() {
		Contact c1 = new Contact(firstname, lastname, age, address, telephone, email);
		Contact c2 = new Contact("George", "Costanza", 50, "New York city", 55516424, "myemail@hotmail.com");
		
		assertNotEquals(c1, c2);
	}
	
}
