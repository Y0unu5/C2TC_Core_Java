package Day15_ExceptionHandling;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		try {
			// code that generates exception
			int divideByZero = 5 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

		finally {
			System.out.println("This is the finally block");
		}
	}
}
