package Day17_Collection_Framework;

import java.util.LinkedList;

class Product {
	int price;
	double qty;
	String type;

	public Product(int price, double qty, String type) {

		this.price = price;
		this.qty = qty;
		this.type = type;
	}

}

public class LLDemo {

	public static void main(String[] args) {
		Product p1 = new Product(1200, 1, "Waterbottle");
		Product p2 = new Product(1400, 3, "Shampoo");
		LinkedList<Product> lst = new LinkedList<Product>();
		lst.add(p2);
		lst.add(p1);

		Product p10 = new Product(50000, 2, "Mobile");

		lst.add(p10);
		for (Product p : lst) {
			System.out.println(p.qty + " " + p.price + " " + p.type);
		}

	}

}
