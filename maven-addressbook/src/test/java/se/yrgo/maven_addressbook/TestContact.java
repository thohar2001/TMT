package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContact {

	private String firstname = "Bo";
	private String lastname = "Andersson";
	private int age = 35;
	private String address = "Dirty Boulevard";
	private int telephone = 555164200;
	private String email = "email@andersson.com";
	
	@Test
	public void testConstructor() {
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		
		assertEquals(firstname, null); // TODO: replace null with actual value. 		
		assertEquals(lastname, null); // TODO: replace null with actual value.
		assertEquals(age, null); // TODO: replace null with actual value.
		assertEquals(address, c.getAddress());
		assertEquals(telephone, c.getPhoneNumber());
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
