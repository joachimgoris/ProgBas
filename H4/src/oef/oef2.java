package oef;

import java.util.Scanner;

public class oef2 {

	public static void main(String[] args) {
		int a, b, c = 0, d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef het eerste getal in.");
		a = keyboard.nextInt();
		System.out.println("Geef het tweede getal in.");
		b = keyboard.nextInt();
		keyboard.close();
		
		if(a>b) {
			c = a-b;
			System.out.println(a +" - "+b +" = "+c);
		} else if(a<b) {
			c = b-a;
			System.out.println(b+" - "+a+" = "+c);
		} else if(a==b) {
			System.out.println("Gelieve 2 verschillende getallen te selecteren.");
		}
		d = c * 5;
		System.out.println(c +" x "+" 5 = "+ d);
	}

}
