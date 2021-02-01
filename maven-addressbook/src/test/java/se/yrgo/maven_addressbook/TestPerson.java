package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testgetFirstNameIgnoringCase() {
		Person person1 = new Person("BoSSe", "Bossesson", 12);
		assertTrue(person1.getFirstName().equalsIgnoreCase("bosse"));
	}
	
	@Test
	public void testgetFirstName() {
		Person person1 = new Person("Bosse", "Bossesson", 12);
		assertEquals(person1.getFirstName(), "Bosse");
	}
	
}