package Day30_Generics;

class GenericClass<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		GenericClass<Integer> obj = new GenericClass<Integer>();
		obj.add(2);
		System.out.println(obj.get());
		GenericClass<String> obj1 = new GenericClass<String>();
		obj1.add("MK Younus");
		System.out.println(obj1.get());
	}

}
