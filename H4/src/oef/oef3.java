package oef;

import java.util.Scanner;

public class oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double totaal, aantal, prijs;
		
		System.out.println("Geef het aantal.");
		aantal = keyboard.nextInt();
		System.out.println("Geef de eenheidsprijs.");
		prijs = keyboard.nextInt();
		
		totaal = aantal*prijs;
		if(totaal>500 && totaal<1000) {
			totaal -= 10;
		} else if(totaal>1000) {
			totaal -= 22;
		}
		System.out.println("Het totaal is: "+totaal);
	}

}
