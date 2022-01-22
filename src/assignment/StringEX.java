package assignment;

import java.util.Scanner;

public class StringEX {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		str = sc.nextLine();
		System.out.println("After a reversing a String");
		for (int i = str.length(); i > 0; --i) {
			System.out.print(str.charAt(i - 1));
		}
	}

}
