package Day17_Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("two");
		set.add("three");
		set.add("five");
		set.add("five");
		set.add("Six");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
