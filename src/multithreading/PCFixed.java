package multithreading;

public class PCFixed {

	public static void main(String[] args) {
		My y = new My();
		Producer p = new Producer(y);
		Consumer c = new Consumer(y);

		// Start the threads
		p.t.start();
		c.t.start();

		System.out.println("Press control c to stop.");

	}

}
