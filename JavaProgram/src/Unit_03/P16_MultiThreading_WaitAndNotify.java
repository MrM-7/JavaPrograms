package Unit_03;

public class P16_MultiThreading_WaitAndNotify {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		new Thread() {
			public void run() {
				b.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				b.deposit(10000);
			}
		}.start();
		
	}

}


class Bank {
	
	int amount = 10000;
	
	void withdraw(int amount) {
		
		if(this.amount < amount) {
			System.out.println("Less balance; waiting for deposit!");
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.amount -= amount;
		System.out.println("Withdraw completed...");
	}
	
	void deposit(int amount) {
		
		System.out.println("Going to deposit...");
		
		this.amount += amount;
		System.out.println("Deposit completed...");
		notify();		
	}
}