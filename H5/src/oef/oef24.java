package oef;

import java.util.Scanner;

public class oef24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aantal, genre, sterren, uitgave;

		System.out.println("Geef aatal films, genre, sterren, uitgave en speeltijd");
		aantal = input.nextInt();
		genre = input.nextInt();
		sterren = input.nextInt();
		uitgave = input.nextInt();
		input.close();
		
		System.out.println("Prijs: �"+huurprijs(aantal, genre, sterren, uitgave));
		System.out.println("Huurtijd: �"+huurtijd(aantal, genre, sterren, uitgave));
	}

	public static double huurprijs(int aantal, int genre, int sterren, int uitgave) {
		double retvalue = 0;
		for (int i = 0; i < aantal; i++) {
			while (genre < 1000 && genre >= 2000) {
				if (sterren > 3) {
					retvalue += 4.5;
				} else {
					if (sterren > 1) {
						retvalue += 3.75;
					} else
						retvalue += 3;
				}
				if ((2017 - uitgave) >= 10)
					retvalue -= 0.50;
			}
		}
		return retvalue;
	}

	public static double huurtijd(int aantal, int genre, int sterren, int uitgave) {
		double retvalue = 0;
		for (int i = 0; i < aantal; i++) {
			if ((2017 - uitgave) <= 2 || sterren == 5 || genre >= 5000) {
				retvalue = 1;
			} else {
				retvalue = 2;
			}
		}

		return retvalue;
	}

}
