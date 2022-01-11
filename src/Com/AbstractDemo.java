package Com;

abstract class Bank2 {
	abstract float getRateOfInterest();

	void display() {
		System.out.println("Abstarct class");
	}

}

class SBI2 extends Bank2 {
	@Override
	float getRateOfInterest() {
		return 7.0f;
	}

}

class HDFC2 extends Bank2 {
	float getRateOfInterest() {
		return 6.8f;
	}
}

class ICICI2 extends Bank2 {
	float getRateOfInterest() {
		return 6.9f;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		SBI2 obj = new SBI2();
		System.out.println(obj.getRateOfInterest());

		Bank2 obj1 = new ICICI2();
		System.out.println(obj1.getRateOfInterest());

	}

}
