package String;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Younus";
		String s2 = "Younus";
		String s3 = new String("Programmer");
		String s4 = new String("Programmer");
		System.out.println("The length of Strings are:");
		System.out.println(s1.length() + ", " + s2.length() + ", " + s3.length() + ", " + s4.length());
		String s5 = s1 + s3;
		System.out.println(s1 + s3);
		String s6 = s1.toUpperCase();
		System.out.println(s6);
		System.out.println(s6.toLowerCase());
		String s7 = s3.substring(3);
		String s8 = s3.substring(3, 10);
		System.out.println(s7 + ", " + s8);
		System.out.println(s3.substring(3, 7));

		String sentence = "Hi welcome to java class";
		char ch[] = sentence.toCharArray();
		for (int i = 0; i < sentence.length(); i++) {
			System.out.println(ch[i]);
		}
		if (s3.startsWith("Z")) {
			System.out.println("Starts with p");
		}
		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("They arte equal");
		}
		if (s1 == s3) {
			System.out.println("They are equal");
		}
	}

}
