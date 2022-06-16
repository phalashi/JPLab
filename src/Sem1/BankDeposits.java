package Sem1;

/* 9: Program to implement the following. A Boy has his money deposited $1000, $1500 and $2000 in
banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a class &#39;Bank&#39; with a method &#39;getBalance&#39; which returns 0. Make its three subclasses named &#39;BankA&#39;, &#39;BankB&#39;
and &#39;BankC&#39; with a method with the same name &#39;getBalance&#39; which returns the amount deposited in that particular
bank. Call the method &#39;getBalance&#39; by the object of each of the three banks. */

class Bank {
	int getBalance() {
		return 0;
	}
}

class BankA extends Bank {
	int deposit;

	public BankA(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return this.deposit;
	}
}

class BankB extends Bank {
	int deposit;

	public BankB(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return this.deposit;
	}
}

class BankC extends Bank {
	int deposit;

	public BankC(int deposit) {
		this.deposit = deposit;
	}

	public int getBalance() {
		return this.deposit;
	}
}

public class BankDeposits {

	public static void main(String[] args) {
		BankA banka = new BankA(1000);
		BankA bankb = new BankA(1500);
		BankA bankc = new BankA(2000);
		System.out.printf("%d %d %d", banka.getBalance(), bankb.getBalance(), bankc.getBalance());

	}

}
