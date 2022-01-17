package Day17_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(new Integer(10));
		ll.add("Hi");
		ll.addFirst("Hello");
		ll.add(0, 25);
		ll.addLast("Last");
		ll.add(2, 20);
		System.out.println(ll);
		Iterator i1 = ll.iterator();
		while (i1.hasNext()) {
			Object o = i1.next();
			System.out.println(o);
		}
	}

}
