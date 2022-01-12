package Day16_ExceptionHandling;

import java.io.IOException;

public class ExceptionHandlingEx4 {
	void m() throws IOException {
		throw new IOException("Device Error"); // Checked Exception

	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingEx4 obj = new ExceptionHandlingEx4();
		obj.p();
		System.out.println("Normal Flow...");

	}

}
