package oef;

import java.util.Scanner;

public class oef19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		System.out.println("Geef lengte");
		getal = keyboard.nextInt();
		
		piramide(getal);
		keyboard.close();
	}
	
	public static void piramide(int getal){
		for(int i = 0;i<getal;i--)
		{
			for(int i2 = 0; i2<i; i2++) {
				System.out.print("@\t");
			}
			System.out.println();
		}
	}

}
