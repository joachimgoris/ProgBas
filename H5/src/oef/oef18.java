package oef;

import java.util.Scanner;

public class oef18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;

		System.out.println("Geef getal");
		getal = keyboard.nextInt();

		while (getal != 0) {
			
			System.out.println(faculteit(getal));
			System.out.println("Geef getal");
			getal = keyboard.nextInt();
		}
		
		keyboard.close();
	}
	
	public static int faculteit(int getal) {
		int retvalue = 1;
		for (int i = 2; i <= getal; i++) {
			retvalue *= i;
		}
		return retvalue;
	}

}
