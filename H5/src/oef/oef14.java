package oef;

import java.util.Scanner;

public class oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int artikelnr, hoeveelheid;
		double eenheidsprijs, bedrag;
		double totaalBedrag=0;
		
		System.out.println("Geef het artikelnr");
		artikelnr = keyboard.nextInt();
		while(artikelnr != 999) {
			System.out.println("Geef het aantal");
			hoeveelheid = keyboard.nextInt();
			System.out.println("Geef de eenheidsprijs");
			
			
			eenheidsprijs = keyboard.nextDouble();
			bedrag = eenheidsprijs*hoeveelheid;
			totaalBedrag += bedrag;
			
			
			System.out.println("artikelnr: "+artikelnr);
			System.out.println("hoeveelheid: "+hoeveelheid);
			System.out.println("eenheidsprijs: "+eenheidsprijs);
			System.out.println("Bedrag: "+bedrag);
			
			System.out.println("Geef het artikelnr");
			artikelnr = keyboard.nextInt();
		}
		System.out.println("Totaalbedrag: "+totaalBedrag);
		keyboard.close();
	}

}
