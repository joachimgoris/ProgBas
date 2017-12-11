package Voorbeelden;

import java.util.Scanner;

public class Opdracht16b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef je bruto inkomen");
		double bruto = keyboard.nextDouble();
		keyboard.close();
		
		double belastingen = berekenBelastingen(bruto);	
		
		System.out.println("Te betalen belastingen: "+belastingen);
	}

	public static double berekenBelastingen(double bruto) {
		double belast;
		if(bruto<=25000) {
			belast = bruto/100*38.4;
		} else {
			if(bruto <+ 55000) {
				belast = 25000*38.4/100 + (bruto - 25000)*50/100;
			} else {
				belast = 25000*38.4/100 + 30000 * 50.0 / 100 + (bruto - 55000) * 60 / 100;
			}
		}
		return belast;
	}

}
