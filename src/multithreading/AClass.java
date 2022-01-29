package multithreading;

public class AClass {
	int bal;
	int oldbal;

	synchronized void deposit(int amt) {
		System.out.println("Getting balance....");
		bal = oldbal + amt;
		setBalance(bal);
	}

	synchronized void withdraw(int amt) {
		System.out.println("Withdrawing Amount");
		int oldbal = getBalance();
		bal = oldbal - amt;

	}

	int getBalance() {
		return Account.Balance;
	}

	void setBalance(int amt) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		Account.Balance = amt;
	}
}