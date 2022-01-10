
public class Variables_Demo {

	final static int a = 1024;
	int b;

	void func1() {
		final int c;
		c = 10;
		System.out.println("class variables" + a + "" + b);
		System.out.println("local variable" + c);
		b = 56;
		System.out.println("class variable" + a + "" + b);

	}

	void func2() {

		System.out.println("class variables" + a + "" + b);
	}

	public static void main(String[] args) {
		Variables_Demo obj = new Variables_Demo();
		System.out.println(obj.b);
		System.out.println(Variables_Demo.a);

	}

}
