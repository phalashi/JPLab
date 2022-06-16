package Sem1;

interface Bill {
	double calcBill(int units);

	void printBill(double amount);
}

abstract class Print implements Bill {
	public abstract void PrintBill(double Amount);
}

class PowerBill extends Print {
	double rate = 2.3;

	public double calcBill(int units) {
		return rate * units;
	}

	@Override
	public void printBill(double amount) {
		System.out.println(amount);
	}
}

class WaterBill extends Print {
	double rate = 5.3;

	public double calcBill(int units) {
		return rate * units;
	}

	@Override
	public void printBill(double amount) {
		System.out.println(amount);
	}
}

public class BilllGenerate {

	public static void main(String[] args) {
		PowerBill pb = new PowerBill();
		WaterBill wb = new WaterBill();
		System.out.println(pb.calcBill(100));
		pb.printBill(500);
		System.out.println(wb.calcBill(200));
		wb.printBill(300);

	}

}
