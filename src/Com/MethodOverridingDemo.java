package Com;

abstract class Bank1 {
	abstract float getRateOfInterest();

	void display() {
		System.out.println("Abstarct class");
	}

}

class SBI1 extends Bank1 {
	@Override
	float getRateOfInterest() {
		return 7.0f;
	}

}

class HDFC1 extends Bank1 {
	float getRateOfInterest() {
		return 6.8f;
	}
}

class ICICI1 extends Bank1 {
	float getRateOfInterest() {
		return 6.9f;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		SBI1 obj = new SBI1();
		System.out.println(obj.getRateOfInterest());

		Bank1 obj1 = new ICICI1();
		System.out.println(obj1.getRateOfInterest());

	}

}
