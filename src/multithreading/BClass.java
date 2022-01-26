package multithreading;

public class BClass implements Runnable {
	String msg;

	public BClass(String msg) {

		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 0; i < msg.length(); i++) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			System.out.println(msg.charAt(i));
		}
	}

}