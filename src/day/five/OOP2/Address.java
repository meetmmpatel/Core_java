package day.five.OOP2;

public class Address {

	// it allows to determine HAS-A relations ship with other class.

	int streetName;
	String city;
	String state;
	String country;

	public Address(int streetName, String city, String state, String country) {
		
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	

}
