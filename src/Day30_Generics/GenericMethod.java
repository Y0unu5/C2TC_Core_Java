package Day30_Generics;

public class GenericMethod {
	public <E> void displayArrayElements(E[] elements) {
		for (E element : elements) {
			System.out.println("Element is : " + element);
		}
	}

	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		Integer intarray[] = { 10, 20, 40, 50 };
		String str[] = { "Java", "C++", "Python" };
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);
	}

}
