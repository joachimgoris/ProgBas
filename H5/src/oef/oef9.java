package oef;

import java.util.Scanner;

public class oef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a, b;
		String c;
		
		System.out.println("Geef 1");
		a = keyboard.nextInt();
		System.out.println("Geef 2");
		b = keyboard.nextInt();
		System.out.println("Geef 3");
		c = keyboard.nextLine();
		keyboard.close();
		
		System.out.println(a+" "+b);
		switch(c) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "a":
			System.out.println(a*a);
			break;
		case "b":
			System.out.println(b*b);
			break;
		default:
			System.out.println("Foutieve code");
		}
	}

}
