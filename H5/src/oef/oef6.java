package oef;

import java.util.Scanner;

public class oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double prijspu = 11.50;
		double btw = 1.21;
		double totaal;
		int aantal;
		
		System.out.println("Aantal artikels?");
		aantal = keyboard.nextInt();
		keyboard.close();
		
		totaal = aantal*prijspu;
		totaal *= btw;
		if(totaal> 1000) {
			totaal *= 0.9;
		}
		System.out.println("€"+totaal);
		
	}

}
