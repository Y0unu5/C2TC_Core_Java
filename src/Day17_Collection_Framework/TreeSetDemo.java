package Day17_Collection_Framework;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Hash");
		ts.add("Hash");
		ts.add("Demo");
		ts.add("Demo");
		ts.add("set");
		//hs.add(new Integer(10));

		Iterator<String> i = ts.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}

	}

}
