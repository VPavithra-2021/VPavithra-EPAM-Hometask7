package EPAM_Hometask7.Hometask7;
import java.util.ArrayList;
import java.util.Iterator;
//Program for Iterator Pattern(Behavioral Pattern)
public class IteratorPattern {
		public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>(); 
			//Adding the elements into the ArrayList
			list.add("Honda");
			list.add("Acura");
			list.add("BMW");
			list.add("Hyundai");
			list.add("Renault");
			list.add("Kia");
			list.add("Jaguar");
			list.add("Mercedes-Benz");
			list.add("Suzuki");
			list.add("Tata");	
				Iterator<String> i = list.iterator();
						while(i.hasNext()) {
							System.out.println(i.next());
						}
		}
	}
