package multithreading;

class Producer implements Runnable {
	My y;
	Thread t;

	Producer(My y) {
		this.y = y;
		t = new Thread(this, "Producer");
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			y.put(i++);
		}

	}

}

class Consumer implements Runnable {
	My y;
	Thread t;

	Consumer(My y) {
		this.y = y;
		t = new Thread(this, "Consumer");
	}

	@Override
	public void run() {
		while (true) {
			y.get();
		}
	}

}