package oef;

import java.util.Scanner;

public class oef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int lengte, breedte, liters;
		
		System.out.println("Geef de lengte, breedte en liters");
		lengte = keyboard.nextInt();
		breedte = keyboard.nextInt();
		liters = keyboard.nextInt();
		
		System.out.println(bereken(lengte, breedte, liters));
		
		keyboard.close();
	}
	
	public static double bereken(int lengte, int breedte, int liters) {
		double retvalue, oppervlakte;
		
		oppervlakte = lengte*breedte;
		retvalue = (Math.round(oppervlakte/7))/liters;
		
		return retvalue;
	}

}
