package Day17_Collection_Framework;

import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
	/*	ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList is empty:" + al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After insertion ");
		System.out.println("Is ArrayList is empty:" + al.isEmpty());*/

		// using retaiAll() Method:
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Mk");
		al1.add("younus");
		al1.add("Innu");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("mk");
		al2.add("salman");

		al1.retainAll(al2);
		//System.out.println("Iterating the elements after retaining the elements of al2");
		Iterator itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); 
			System.out.println(al1);
		}

	}

}
