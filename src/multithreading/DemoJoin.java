package multithreading;



public class DemoJoin {

	public static void main(String[] args) {
		NewThread mt1 = new NewThread("One");
		NewThread mt2 = new NewThread("Two");
		NewThread mt3 = new NewThread("Three");

		// Start the threads.
		mt1.t.start();
		mt2.t.start();
		mt3.t.start();
		System.out.println("Thread one is alive:" + mt1.t.isAlive());
		System.out.println("Thread two is alive:" + mt2.t.isAlive());
		System.out.println("Thread three is alive:" + mt3.t.isAlive());
//wait for the threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			mt1.t.join();
			mt2.t.join();
			mt3.t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread one is alive:" + mt1.t.isAlive());
		System.out.println("Thread two is alive:" + mt2.t.isAlive());
		System.out.println("Thread three is alive:" + mt3.t.isAlive());
		System.out.println("Main thread is exiting.");

	}

}
