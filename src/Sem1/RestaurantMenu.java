
package Sem1;

interface Restaurant {
	public static final String name = "";

	void printName();

	void totalPrice(int price);

	void menu();
}

class McDonald implements Restaurant {
	public String name = "McDonald's";

	public void printName() {
		System.out.println(this.name);
	}

	public void totalPrice(int price) {
		System.out.println("Price: " + 1.6 * price);
	}

	public void menu() {
		//
	}
}

class KFC implements Restaurant {
	public String name = "KFC";

	public void printName() {
		System.out.println(this.name);
	}

	public void totalPrice(int price) {
		System.out.println("Price: " + 1.6 * price);
	}

	public void menu() {
		//
	}
}

public class RestaurantMenu {

	public static void main(String[] args) {
		McDonald mcd = new McDonald();
		KFC kfc = new KFC();
		mcd.printName();
		kfc.printName();
	}
}
