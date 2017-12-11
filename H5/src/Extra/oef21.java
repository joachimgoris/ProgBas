package Extra;

import java.util.Scanner;

public class oef21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rijksregisterNr, afstand;
		byte wagen, mutualiteit;
		do {
			System.out.println("Geef rijksregisterNR");
			rijksregisterNr = input.nextInt();
			System.out.println("Geef wagen");
			wagen = input.nextByte();
			System.out.println("Geef afstand in km");
			afstand = input.nextInt();
			System.out.println("Geef lid mutualiteit");
			mutualiteit = input.nextByte();
			
			
		}while(rijksregisterNr!=9999);
		
		
		input.close();
	}

}
