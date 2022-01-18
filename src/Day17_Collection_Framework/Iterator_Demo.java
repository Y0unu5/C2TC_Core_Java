package Day17_Collection_Framework;

import java.util.*;

public class Iterator_Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(17);
		list.add(21);
		list.add(10);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer n = iterator.next();
			System.out.println(n);
			if (n == 21)
				iterator.remove();
		}
		System.out.println("-------------");
		System.out.println(list );
	}

}
