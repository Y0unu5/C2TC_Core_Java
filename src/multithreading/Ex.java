package multithreading;

public class Ex extends Thread {
	int st;
	String msg;

	public Ex(int st, String msg) {

		this.st = st;
		this.msg = msg;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(st);
			} catch (Exception e) {

			}
			System.out.println(msg + i);
		}

	}

}
