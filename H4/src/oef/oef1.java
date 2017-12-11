package oef;

import java.util.Scanner;

public class oef1 {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int sumAdults, sumChildren, total;
		
		System.out.println("Hoeveel volwassenen zijn er?");
		sumAdults = keyboard.nextInt();
		System.out.println("Hoeveel kinderen zijn er?");
		sumChildren = keyboard.nextInt();
		total = (sumAdults*28) + (sumChildren*15);
		System.out.println("Het totaal is €"+total);
		
	}

}