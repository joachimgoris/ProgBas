package oef;

import java.util.Scanner;

public class oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double prijs = 11.5;
		final double percentage = 0.21;
		double exBTW, BTW, inBTW;
		int aantal;
		
		System.out.println("geef aantal");
		aantal = keyboard.nextInt();
		keyboard.close();
		exBTW = aantal*prijs;
		BTW = exBTW*percentage;
		inBTW = exBTW*1.21;
		System.out.println(exBTW+" "+BTW+" "+inBTW);
	}

}
