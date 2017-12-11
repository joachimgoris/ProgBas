package oef;

import java.util.Scanner;

public class oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		
		do {
			System.out.println("Geef getal");
			getal = keyboard.nextInt();
			if(getal<1)
				System.out.println("Fout! Het getal moet groter zijn dan 1");
			if(getal>100)
				System.out.println("Fout! Het getal moet kleiner zijn dan 100");
		}while(getal<1||getal>100);
		keyboard.close();
	}

}
