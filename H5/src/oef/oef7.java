package oef;

import java.util.Scanner;

public class oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int afstand, klasse;
		double totaal;
		double kort = 0.25;
		double middel = 0.20;
		double lang = 0.15;
		double c = 0.8;
		double z = 1.3;

		System.out.println("Geef afstand.");
		afstand = keyboard.nextInt();
		System.out.println("Geef klasse.");
		klasse = keyboard.nextInt();
		keyboard.close();

		if (afstand < 1000) {
			totaal = afstand * kort;
		} else {
			if (afstand <= 2999) {
				totaal = afstand * middel;
			} else {
				totaal = afstand * lang;
			}
		}

		if (klasse == 2) {
			totaal *= c;
		} else {
			if (klasse == 3) {
				totaal *= z;
			}
		}
		System.out.println("€"+Math.round(totaal));
	}

}
