package oef;

import java.util.Scanner;

public class oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int jaar, rating, prijs = 5;

		System.out.println("Geef het jaar.");
		do {
			jaar = keyboard.nextInt();
			if (jaar > 2017 || jaar < 0) {
				System.out.println("Jaar is onbestaand");
				System.out.println("Gelieve een geldig jaar in te geven.");
			}	
		}while(jaar > 2017 || jaar <0);
		
		System.out.println("Geef de rating.");
		do {
			rating = keyboard.nextInt();
			if(rating<0||rating>5) {
				System.out.println("Rating is ongeldig.");
				System.out.println("Gelieve een geldige rating in te geven.");
			}
		}while(rating<0||rating>5);

		keyboard.close();

		if ((2017 - jaar) <= 2) {
			prijs += 1d;
		}
		
		if (rating > 3) {
			prijs += 2;
		} else if(rating >2) {
			prijs +=1;
		}
		if(prijs>7){prijs=7;}		
		System.out.println("Prijs: €" + prijs);
	}

}
