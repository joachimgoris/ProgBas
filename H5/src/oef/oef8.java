package oef;

import java.util.Scanner;

public class oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a, b, c;
		double totaal;
		System.out.println("Eerste");
		a = keyboard.nextInt();
		System.out.println("Tweede");
		b = keyboard.nextInt();
		System.out.println("Derde");
		c = keyboard.nextInt();
		keyboard.close();

		a *= 5;
		b *= 5;
		c *= 5;

		totaal = (a + b + c) / 3;

		System.out.println(totaal);
		if (totaal < 60) {
			System.out.println("Onvoldoende");
		} else {
			if (totaal < 70) {
				System.out.println("Voldoende");
			} else {
				if (totaal < 80) {
					System.out.println("Onderscheiding");
				} else {
					if (totaal < 90) {
						System.out.println("Grote onderscheiding");
					} else {
						System.out.println("Grootste onderscheiding");
					}
				}
			}
		}
	}
}
