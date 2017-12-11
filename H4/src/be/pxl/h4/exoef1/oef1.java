package be.pxl.h4.exoef1;

import java.util.Scanner;

public class oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double getal1, getal2, getal, kwadraat;
		
		System.out.println("Geef het eerste getal.");
		getal1 = keyboard.nextInt();
		System.out.println("Geef het tweede getal.");
		getal2 = keyboard.nextInt();
		keyboard.close();
		
		if(getal1<getal2) {getal=getal1;}
		else {getal=getal2;}
		
		kwadraat = Math.pow(getal, 2);
		System.out.println("Het kleinste getal is "+getal);
		System.out.println("Het kwadraat van het kleinste getal is "+kwadraat);
	}

}
