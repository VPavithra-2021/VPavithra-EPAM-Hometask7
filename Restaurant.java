package EPAM_Hometask7.Hometask7;
//Program for Builder (Creational Design Pattern)
interface Restaurant {
	void fooditems();
}
class VegMeal implements Restaurant
{
	public void fooditems()
	{
		System.out.println("Vegetarian Menu");
		System.out.println("Veg Burger");
		System.out.println("Veg Pizza");
		System.out.println("French Fries");
		System.out.println("Pastha");
		System.out.println("Paneer Masala");
		System.out.println("Roti");
		System.out.println("Veg Briyani");
		System.out.println(" ");
	}
}
class NonVegMeal implements Restaurant
{
	public void fooditems()
	{
		System.out.println("Non-Vegetarian Menu");
		System.out.println("Non-Veg Burger");
		System.out.println("Non-Veg Pizza");
		System.out.println("French Fries");
		System.out.println("Chicken Kabab");
		System.out.println("Mutton Briyani");
		System.out.println("Grilled Chicken Sandwitch");
		System.out.println("Chicken Briyani");
		System.out.println(" ");
	}
}
class Meal {
	public static void main(String[] args) {
		VegMeal ob = new VegMeal();
		NonVegMeal ob1 = new NonVegMeal();
		ob.fooditems();
		ob1.fooditems();
	}
}