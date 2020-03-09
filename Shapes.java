package EPAM_Hometask7.Hometask7;
import java.util.Scanner;
//Program for AbstractFactory (Creational Design Pattern)
abstract class Shapes {
	abstract void area();
}
class Rectangle extends Shapes {
	void area()
	{
		double l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght and breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Area of a rectangle : "+(l*b));
	}
}
class Square extends Shapes {
	void area()
	{
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side :  ");
		s=sc.nextDouble();
		System.out.println("Area of a square : "+(s*s));
	}
}
class Triangle extends Shapes {
	void area()
	{
		double b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height : ");
		b=sc.nextDouble();
		h=sc.nextDouble();
		System.out.println("Area of a triangle : "+(0.5*b*h));
	}
}
class Circle extends Shapes {
	void area()
	{
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r=sc.nextDouble();
		System.out.println("Area of a circle : "+(3.14*r*r));
	}
}
class AbstractFactory
{
	public static void main(String[] args) {
		Rectangle ob1 = new Rectangle();
		Square ob2 = new Square();
		Triangle ob3 = new Triangle();
		Circle ob4 = new Circle();
		ob1.area();
		ob2.area();
		ob3.area();
		ob4.area();
	}
}


