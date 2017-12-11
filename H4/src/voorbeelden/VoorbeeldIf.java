package voorbeelden;

import java.util.Scanner;

public class VoorbeeldIf {
	public static void main(String[] args) {
		int age;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de leeftijd in.");
		age = keyboard.nextInt();
		keyboard.close();

		if (age >= 18) {
			System.out.println("adult");
		} else {
			if (age >= 12) {
				System.out.println("Middelbare school");

			} else {
				if (age >= 6) {
					System.out.println("Lagere school");
				} else {
					if (age >= 0) {
						System.out.println("Peuters");
					} else {
						if (age < 0) {
							System.out.println("Non-existent");
						}
					}
				}
			}
		}
	}
}
