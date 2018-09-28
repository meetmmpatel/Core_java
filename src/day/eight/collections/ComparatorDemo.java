package day.eight.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {

		ArrayList<Author> list = new ArrayList<>();

		list.add(new Author("Henry", "Tropic of Can", 45));
		list.add(new Author("Nalo", "300", 56));
		list.add(new Author("Frank", "Men search for meaning", 89));
		list.add(new Author("Deborah", "Sky boys", 62));
		list.add(new Author("George ", "Game of throns", 38));

		System.out.println("Soritng with First Name=========");
		Collections.sort(list);
		for (Author au : list) {
			System.out.println(au);
		}

		System.out.println("Sorting by Autor's Age==========");

		Collections.sort(list, new AutorAge());
		for (Author au : list) {
			System.out.println(au);
		}

		System.out.println("Sorting by Book Name==========");

		Collections.sort(list, new BookName());
		for (Author au : list) {
			System.out.println(au);
		}

	}

}

class Author implements Comparable<Author> {

	String firstName;
	String bookName;
	int auAge;

	public Author(String firstName, String bookName, int auAge) {
		super();
		this.firstName = firstName;
		this.bookName = bookName;
		this.auAge = auAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuAge() {
		return auAge;
	}

	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}

	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.firstName);
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", bookName=" + bookName + ", auAge=" + auAge + "]";
	}

}

class AutorAge implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {

		if (o1.auAge == o2.auAge)
			return 0;
		else if (o1.auAge > o2.auAge)
			return 1;
		else

			return -1;
	}

}

class BookName implements Comparator<Author> {

	@Override
	public int compare(Author o1, Author o2) {
		// TODO Auto-generated method stub
		return o1.bookName.compareTo(o2.bookName);
	}

}
