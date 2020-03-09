package EPAM_Hometask7.Hometask7;
//Program for Bridge Pattern(Structural Pattern)
abstract class Bike {
	abstract void run();
}
class Honda extends Bike {
	void run()
	{
		System.out.println("Bike running safely with speedlimit 50 Kmph");
	}
}
class Vehicle
{
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
	}
}
