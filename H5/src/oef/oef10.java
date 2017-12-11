package oef;

import java.util.Scanner;

public class oef10 {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			int bruto, beoordeling;
			double totaal;
			
			System.out.println("Geef bruto");
			bruto = keyboard.nextInt();
			System.out.println("Geef beoordeling");
			beoordeling = keyboard.nextInt();
			keyboard.close();
			
			totaal = bruto/20;
			switch(beoordeling){
				case 1:
					totaal *= 0.0;
					break;
				case 2:
					totaal *= 0.18;
					break;
				case 3:
					totaal *= 0.25;
					break;
				case 4:
					totaal *= 0.33;
					break;
			}
			System.out.println("€"+totaal);
	}

}
