package multithreading;

//Using join() to wait for threads to finish
class NewThread implements Runnable {
	String name;
	Thread t;

	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread:" + t);

	}

	// This entry point for thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " " + i);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name + " " + " Exiting.");
	}

}
