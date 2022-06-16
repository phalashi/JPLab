
/* Assignment 13: Create an abstract class named Shape that contains two integers and an empty method named
printArea(). Provide three classes named Rectangle, Triangle, and Circle such that each one of the classes extends
the class Shape. Each one of the classes contains only the method printArea() that prints the area of the given shape.*/

abstract class Shape
{
	public int height;
	public int breadth;
	public Shape(int x, int y)
	{
		this.height = x;
		this.breadth = y;
	}
	public abstract void printArea();

}

class Rectangle extends Shape
{
	public Rectangle(int x, int y) {
		super(x, y);
	}

	public void printArea()
	{
		System.out.println("Area : " + height * breadth );
	}
}

class Circle extends Shape
{
	public Circle(int x, int y) {
		super(x, y);
	}
	public void printArea()
	{
		System.out.println("Area : " + height * height * 3.14);
	}
}

class Triangle extends Shape
{
	public Triangle(int x, int y) {
		super(x, y);
}
	public void printArea()
	{
		System.out.println("Area : " + height * breadth / 2);
	}
}


public class Shapes {

	public static void main(String[] args) {
	
		Rectangle r1 = new Rectangle(1, 2);
		Triangle t1 = new Triangle(2, 3);
		Circle c1 = new Circle(3, 3);
		r1.printArea();
		t1.printArea();
		c1.printArea();
	}

}
