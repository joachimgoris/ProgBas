package oef;

import java.util.Scanner;

public class oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final double bef = 40.3399;
		long getal;
		System.out.println("Geef getal.");
		getal = keyboard.nextLong();
		keyboard.close();
		System.out.println(bef * getal);
	}

}
