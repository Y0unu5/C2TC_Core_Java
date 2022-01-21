package Day17_Collection_Framework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(100, "Amit");
		map.put(105, "sumit");
		map.put(102, "RAvi");
		map.put(103, "mk");
		map.put(101, "younus");
		map.put(104, "op");
	//	map.put(null, "Rohit");
		map.put(106, null);
		
		// Removing Entry based on key
		map.remove(104);
	//Replace An Entry
		map.replace(102, "ROhit");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
