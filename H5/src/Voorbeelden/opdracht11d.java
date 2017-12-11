package Voorbeelden;

import java.util.Scanner;

public class opdracht11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		float lengte;
		int gewicht;
		float bmi;

		System.out.println("geef je lengte");
		lengte = keyboard.nextFloat();

		System.out.println("geef je gewicht");
		gewicht = keyboard.nextInt();

		keyboard.close();
		
		bmi = gewicht / (lengte * lengte);
		System.out.println("de bmi is " + bmi);

		if (bmi >= 40) {
			System.out.println("ziekelijk overgewicht");
		} else {
			if (bmi >= 30) {
				System.out.println("obesitas");
			} else {
				if (bmi >= 25) {
					System.out.println("overgewicht");
				} else {
					System.out.println("melding");
					if (bmi >= 18) {
						System.out.println("ok");
					} else {
						System.out.println("ondergewicht");
					}
				}
			}
		}
	}

}
