package se.yrgo.maven_addressbook;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testGetPersonIgnoringCase() {
		Person person1 = new Person("BoSSe", "Bossesson", 12);
		assertTrue(person1.getFirstName().equalsIgnoreCase("bosse"));
	}
	
}