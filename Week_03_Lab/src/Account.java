import java.util.Scanner;

public class Account {
	private double balance;
	private String ownerName;
	private int password = 1234;

	Account(String ownerName, int balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public  void add(double amount) {
		balance += amount;
		System.out.printf("%f$ added to the account", amount);
	}

	public void withdraw(double amount) {
		int attemptcount = 0;
		Scanner input = new Scanner(System.in);
		int enteredPassword = input.nextInt();
		while (enteredPassword > 9999) {
			System.out.println("Please enter 4-digit pass:");
			enteredPassword = input.nextInt();
		}
		if (this.password == enteredPassword) {
			System.out.println("Password is correct");
			if (this.balance <= amount) {
				System.out.println("Your account doesn't have enough money");
			} else {
				System.out.println("Withdraw completed");
				balance = balance - amount;
			}
		} else {
			System.out.println("Wrong password, try again");
			attemptcount++;
			if (attemptcount == 3) {
				System.out.println("Your account has benn blocked, please try again later.");
				System.exit(0);
			}
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

}
