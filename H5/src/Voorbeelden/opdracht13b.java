package Voorbeelden;

import java.util.Scanner;

public class opdracht13b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		System.out.println("oplossing met een while");
		getal = keyboard.nextInt();
		while(getal<0 || getal>10) { //je gaat in de loop bij ingave van een fout getal
			System.out.println("geef een getal tussen 0 en 10");
			getal = keyboard.nextInt();
			
		}
		System.out.println("Correcte invoer, het getal is "+getal);
		
		System.out.println("oplossing met een do-while");
		int getal2;
		do {
			System.out.println("geef een getal tussen 0 en 10");
			getal2 = keyboard.nextInt();
		}while(getal2<0 || getal2>10);
		keyboard.close();
	}

}
