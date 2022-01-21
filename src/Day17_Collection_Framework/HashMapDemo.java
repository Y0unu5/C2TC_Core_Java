package Day17_Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Creating A HashMap
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grass");
		map.put(null, null);
		map.put(null, "Berry");
		map.put(5, null);
		System.out.println("Iterating HashMap");
		// Replacing an Entry
		map.replace(4, "Ananas");
		// Removing an entry based on key
		map.remove(5);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
