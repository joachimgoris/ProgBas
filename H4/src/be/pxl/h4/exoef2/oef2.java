package be.pxl.h4.exoef2;

import java.util.Scanner;

public class oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Geef de 3 getallen, gescheiden met een enter.");
		a = keyboard.nextInt();
		b  = keyboard.nextInt();
		c = keyboard.nextInt();
		keyboard.close();
		
		if((a+b)<20) 
		{
			System.out.println(a+b+c);
		}
		else 
		{
			System.out.println("Te groot");
		}
	}

}
