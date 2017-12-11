package Voorbeelden;

import java.util.Scanner;

public class Opdracht16a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal");
		int getal = keyboard.nextInt();
		keyboard.close();
		
		toonTafel(getal);
	}
	
	public static void toonTafel(int getal) {
		for(int i = 0; i<=10;i++) {
			System.out.println(getal*i);
		}
	}

}
