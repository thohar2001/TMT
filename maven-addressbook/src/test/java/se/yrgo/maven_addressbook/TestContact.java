package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestContact {

	@Test
	public void testConstructor() {
		String firstname = "Bo";
		String lastname = "Andersson";
		int age = 35;
		String address = "Dirty Boulevard";
		int telephone = 555164200;
		String email = "email@andersson.com";
		Contact c = new Contact(firstname, lastname, age, address, telephone, email);
		// TODO: Check that firstname, lastname and age are correct.
		fail("Not yet implemented");
	}
	
	@Test
	public void test2EqualContact() {
		fail("Not yet implemented");
	}

	@Test
	public void test2NonEqualContact() {
		fail("Not yet implemented");
	}
	
}
