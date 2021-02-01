package se.yrgo.maven_addressbook;

public class App 
{
    public static void main( String[] args ) {
        AddressBook aBook = new AddressBook();
        Contact c1 = new Contact("George", "Costanza", 50, "New York city", 55516424, "myemail@hotmail.com");
        Contact c2 = new Contact("Jerry", "Seinfeld", 45, "New York city", 55516344, "jerrymillions@hotmail.com");
        aBook.addContact(c1);
        aBook.addContact(c2);
        try {
        	Contact c = aBook.findContact("jerrymillions@hotmail.com");
        	System.out.println("Found contact: " + c.getFirstName() + " " + c.getLastName());
        } catch (Exception e) {
			System.out.print(e.getMessage());
		}
    }
}
