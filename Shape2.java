package EPAM_Hometask7.Hometask7;
import java.util.Scanner;
//Program for facade Pattern(Structural Pattern)
interface Shape2 {
	void area(); 
}
class Rect implements Shape2 {
	public void area()
	{
		double l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght and breadth : ");
		l=sc.nextDouble();
		b=sc.nextDouble();
		System.out.println("Area of a rectangle : "+(l*b));
	}
}
class Squ implements Shape2 {
	public void area()
	{
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side :  ");
		s=sc.nextDouble();
		System.out.println("Area of a square : "+(s*s));
	}
}
class Tri implements Shape2 {
	public void area()
	{
		double b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height : ");
		b=sc.nextDouble();
		h=sc.nextDouble();
		System.out.println("Area of a triangle : "+(0.5*b*h));
	}
}
class Cir implements Shape2 {
	public void area()
	{
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r=sc.nextDouble();
		System.out.println("Area of a circle : "+(3.14*r*r));
	}
}
class FacadePattern
{
	public static void main(String[] args) {
		Rect ob1 = new Rect();
		Squ ob2 = new Squ();
		Tri ob3 = new Tri();
		Cir ob4 = new Cir();
		ob1.area();
		ob2.area();
		ob3.area();
		ob4.area();
	}
}



