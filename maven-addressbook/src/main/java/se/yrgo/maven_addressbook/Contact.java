package se.yrgo.maven_addressbook;

import java.util.Objects;

public class Contact extends Person {

	private String address;
	private int phoneNumber;
	private String email;

	/**
	 * 
	 * @param firstname   Lastname.
	 * @param lastname    Firstname.
	 * @param age         Current age.
	 * @param address     Street address.
	 * @param phoneNumber Swedish phone number without country code.
	 * @param email       Email address of contact.
	 */
	public Contact(String firstname, String lastname, int age, String address, int phoneNumber, String email) {
		super(firstname, lastname, age);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
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

	/**
	 * Returns true if both contacts have the same e-mail address.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contact))
			return false;
		Contact other = (Contact) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
}
