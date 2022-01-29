package multithreading;

public class Account {
	static int Balance = 10000;

	public static void main(String[] args) {
		AClass oa = new AClass();

		DepositThread dt1 = new DepositThread(oa, 5000, "First");
		DepositThread dt2 = new DepositThread(oa, 4000, "Second");
		WithdrawThread wt1=new WithdrawThread(oa,5000,"First");
		//WithdrawThread wt2=new WithdrawThread(oa,3000,"Second");
		Thread th=new Thread((Runnable) wt1);
		dt1.start();
		dt2.start();
        th.start();
        
		
		try {
			dt1.join();
			dt2.join();
			th.join();
		} catch (Exception e) {
		}
		System.out.println("Total balance is: " + Balance);
	}

}
