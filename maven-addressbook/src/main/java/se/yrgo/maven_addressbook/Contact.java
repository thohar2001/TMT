package se.yrgo.maven_addressbook;

public class Contact extends Person {
	
	private String address;
	private int phoneNumber;
	private String email;
	
	/**
	 * 
	 * @param firstname Lastname.
	 * @param lastname Firstname.
	 * @param age Current age.
	 * @param address Street address.
	 * @param phoneNumber Swedish phone number without country code. 
	 * @param email Email address of contact.
	 */
	public Contact(String firstname, String lastname, int age, String address, int phoneNumber, String email) {
		super(); 		// TODO: call superclass constructor with super(firstname, lastname, age);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO: vad har vi för kriterier för två Contact objekt att vara lika? Två lika mejladresser?
		return super.equals(obj);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
