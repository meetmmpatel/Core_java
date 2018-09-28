package day.eight.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemoOne {

	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Person("Henry", "Miller", "!00 Main st"));
		personList.add(new Person("Nalo", "Hopkins", "200 Main st"));
		personList.add(new Person("Frank", "Miller", "!00 Main st"));
		personList.add(new Person("Deborah", "Hopkins", "!00 Main st"));
		personList.add(new Person("George", "Martin", "!00 Main st"));

		Collections.sort(personList);
		for (Person pl : personList) {
			System.out.println(pl.firstName + " " + pl.lastName + " " + pl.address);
		}
	}

}

class Person implements Comparable<Person> {

	String firstName;
	String lastName;
	String address;

	public Person(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub

		int last = this.lastName.compareTo(o.lastName);
		return last == 0 ? this.firstName.compareTo(o.firstName) : last;
	}

}
