package oef;

import java.util.Scanner;

public class oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double afgKm, verbruik, prijsL, kostprijs, verbruikskosten;
		
		System.out.println("afgKm");
		afgKm = keyboard.nextDouble();
		System.out.println("verbruik");
		verbruik = keyboard.nextDouble();
		System.out.println("prijsL");
		prijsL = keyboard.nextDouble();
		
		verbruikskosten = verbruik*prijsL;
		kostprijs = verbruikskosten/afgKm;
		System.out.println(verbruikskosten+" "+kostprijs);
		keyboard.close();
	}

}
