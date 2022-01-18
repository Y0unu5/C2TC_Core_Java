package Day17_Collection_Framework;

import java.util.*;

public class Enumeration_Demo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();
		vector.add(3);
		vector.add(1);
		vector.add(9);
		vector.add(11);
		vector.add(6);
		vector.add(2);
		Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Integer n = elements.nextElement();
			System.out.println(n);
		}
		System.out.println("----------------------");
		System.out.println(vector);
	}

}
