package Sem1;

/*JavaSE application to generate Electricity bill (use if-else-if ladder)
inputs are old reading and current reading and generate the bill by following slabs/ranges: Scan the inputs using
Scanner class
0-50: Rs.1
50-100: Rs2
100-200: Rs.3
200-400: Rs.4
&gt;400: Rs.5
example if the number of units are 120 then the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210*/
import java.util.Scanner;

public class ElectricityBill {

	public static int bill(int oldReading, int newReading) {
		int total = 0;
		int units = newReading - oldReading;
		if (units < 0)
			return -1;

		if (units >= 400) {
			total += 5 * (units - 400);
			units = 400;
		}
		if (units >= 200) {
			total += 4 * (units - 200);
			units = 200;
		}
		if (units >= 100) {
			total += 3 * (units - 100);
			units = 100;
		}
		if (units >= 50) {
			total += 2 * (units - 50);
			units = 50;
		}
		if (units >= 0) {
			total += units;
			units = 0;
		}

		return total;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int oldReading, newReading;
		System.out.println("Enter the old reading: ");
		oldReading = scan.nextInt();
		System.out.println("Enter the new reading: ");
		newReading = scan.nextInt();
		System.out.println("Bill: " + bill(oldReading, newReading));

	}

}
