package EPAM_Hometask7.Hometask7;
import java.util.Scanner;
//Program for Interpreter(Behavioral DesignPattern)
interface Arth {
	void operation();
}
 class Add implements Arth {
	public void operation()
	{
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Addition is : "+(a+b));
	}
}
 class Sub implements Arth {
	public void operation()
	{
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Subtraction is : "+(a-b));
	}
}
 class Mul implements Arth {
	public void operation()
	{
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Multiplication is : "+(a*b));
	}
}
 class Div implements Arth {
	public void operation()
	{
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Division is : "+(a/b));
	}
}
 class ModuloDiv implements Arth {
	public void operation()
	{
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a and b values : ");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("Modulo Division is : "+(a%b));
	}
}
 class ArthimeticOperations {
	 public static void main(String[] args) {
		 Add ob1 = new Add();
		 Sub ob2 = new Sub();
		 Mul ob3 = new Mul();
		 Div ob4 = new Div();
		 ModuloDiv ob5 = new ModuloDiv();
		 ob1.operation();
		 ob2.operation();
		 ob3.operation();
		 ob4.operation();
		 ob5.operation();
	 }
 }
