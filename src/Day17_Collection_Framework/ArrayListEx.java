package Day17_Collection_Framework;

import java.util.*;

class Book {
	int id;
	String name, author, pulisher;
	int quantity;

	public Book(int id, String name, String author, String pulisher, int quantity) {

		this.id = id;
		this.name = name;
		this.author = author;
		this.pulisher = pulisher;
		this.quantity = quantity;
	}

}

public class ArrayListEx {

	public static void main(String[] args) {
		// Creating list of books
		List<Book> list = new ArrayList<Book>();

		// Creating books
		Book b1 = new Book(101, "Java", "James GOsling", "Sun Microsystem", 10);
		Book b2 = new Book(201, "DSA", "mk", "Books21", 15);
		Book b3 = new Book(250, "Operating System", "Galvin", "Wiley", 8);

		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing the list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + "  " + b.pulisher + " " + b.quantity);

		}
	}
}
