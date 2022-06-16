package Sem1;

import java.util.Scanner;

/*create an interface named Bank with the services (use proper input parameters and return types) -
create account, credit amount, debit amount, transfer amount, mini statement and with fixed rate of interest. Provide
two implementation classes SBI, Axis with necessary implementations. Use Late binding to create respective object
and call the methods.*/

interface Bank1 {
	void createAccount();

	void creditAmount();

	void debitAmount();

	void transferAmount();

	void miniStatement();
}

class Axis implements Bank1 {
	String name, lname, statement = "";
	int bankAccNo, age;
	double interestRate = 3.2, balance = 0;
	Scanner console = new Scanner(System.in);

	public void createAccount() {
		System.out.println("Enter first name: ");
		this.name = console.next();
		System.out.println("Enter last name: ");
		this.lname = console.next();
		System.out.println("Enter age: ");
		this.age = console.nextInt();
		System.out.println("Enter account number: ");
		this.bankAccNo = console.nextInt();

	}

	public void creditAmount() {
		System.out.println("Enter credit amount: ");
		double creditAmt = console.nextDouble();
		this.balance += creditAmt;
		this.statement += "Credited Amount: " + creditAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void debitAmount() {
		System.out.println("Enter debit amount: ");
		double debitAmt = console.nextDouble();
		if (balance - debitAmt < 0) {
			System.out.println("Account balance insufficient.");
			return;
		}
		this.balance -= debitAmt;
		this.statement += "Debited Amount: " + debitAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void transferAmount() {
		System.out.println("Enter bank account number to transfer to: ");
		int transferAcc = console.nextInt();
		System.out.println("Enter transfer amount: ");
		double debitAmt = console.nextDouble();
		if (balance - debitAmt < 0) {
			System.out.println("Account balance insufficient.");
			return;
		}
		this.balance -= debitAmt;
		this.statement += "Transferred Amount: " + debitAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void miniStatement() {
		System.out.print(this.statement);
	}
}

class SBI implements Bank1 {
	String name, lname, statement = "";
	int bankAccNo, age;
	double interestRate = 4.2, balance = 0;
	Scanner console = new Scanner(System.in);

	public void createAccount() {
		System.out.println("Enter first name: ");
		this.name = console.next();
		System.out.println("Enter last name: ");
		this.lname = console.next();
		System.out.println("Enter age: ");
		this.age = console.nextInt();
		System.out.println("Enter account number: ");
		this.bankAccNo = console.nextInt();

	}

	public void creditAmount() {
		System.out.println("Enter credit amount: ");
		double creditAmt = console.nextDouble();
		this.balance += creditAmt;
		this.statement += "Credited Amount: " + creditAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void debitAmount() {
		System.out.println("Enter debit amount: ");
		double debitAmt = console.nextDouble();
		if (balance - debitAmt < 0) {
			System.out.println("Account balance insufficient.");
			return;
		}
		this.balance -= debitAmt;
		this.statement += "Debited Amount: " + debitAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void transferAmount() {
		System.out.println("Enter bank account number to transfer to: ");
		int transferAcc = console.nextInt();
		System.out.println("Enter transfer amount: ");
		double debitAmt = console.nextDouble();
		if (balance - debitAmt < 0) {
			System.out.println("Account balance insufficient.");
			return;
		}
		this.balance -= debitAmt;
		this.statement += "Transferred Amount: " + debitAmt + "\n New Balance: " + this.balance + "\n";
	}

	public void miniStatement() {
		System.out.print(this.statement);
	}
}

public class BankServices {

	public static void main(String[] args) {

		Axis axisAcc1 = new Axis();
		SBI sbiAcc1 = new SBI();
		axisAcc1.createAccount();
		axisAcc1.miniStatement();
		axisAcc1.creditAmount();
		axisAcc1.miniStatement();
		axisAcc1.debitAmount();
		axisAcc1.miniStatement();
		axisAcc1.transferAmount();
		axisAcc1.miniStatement();

	}

}
