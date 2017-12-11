package oef;

import java.util.Scanner;

public class oef25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int geslacht =0, gewicht = 0;
		double lengte = 0.0;
		
		System.out.println("Geef geslacht, gewicht en lengte");
		geslacht = input.nextInt();
		gewicht = input.nextInt();
		lengte = input.nextDouble();
		
		double bmi = berekenBMI(geslacht, gewicht, lengte);
		
		if(bmi<18) {
			System.out.println("Ondergewicht");
		} else {
			if(bmi>=18&&bmi<25) {
				System.out.println("Normaal gewicht");
			} else {
				if(bmi>=25&&bmi<27) {
					System.out.println("Neiging tot overgewicht");
				} else {
					if(bmi>=27&&bmi<30) {
						System.out.println("Overgewicht");
					} else {
						if(bmi>=30&&bmi<40) {
							System.out.println("Zwaarlijvigheid");
						} else {
							if(bmi>=40) {
								System.out.println("Ernstige zwaarlijvigheid");
							}
						}
					}
				}
			}
		}
		input.close();
	}

	private static double berekenBMI(int geslacht, int gewicht, double lengte) {
		double retvalue = gewicht/Math.pow(lengte, 2);
		retvalue = Math.round(retvalue);
		return retvalue;
	}

}
