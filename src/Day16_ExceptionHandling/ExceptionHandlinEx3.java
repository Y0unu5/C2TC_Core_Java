package Day16_ExceptionHandling;

public class ExceptionHandlinEx3 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		try {
			validate(30);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();

		}
		System.out.println("rest of the code....");
	}

}
