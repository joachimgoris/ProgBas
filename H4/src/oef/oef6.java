package oef;

import java.util.Scanner;

public class oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal, resultaat;
		
		System.out.println("Geef een getal.");
		getal = keyboard.nextInt();
		
		for(int i=1; i<=20; i++) {
			resultaat = i*getal;
			System.out.println(i+" * "+getal+" = "+resultaat);
		}
	}

}
