package oef;

import java.util.Scanner;

public class oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int bedrag;
		System.out.println("Geef een bedrag.");
		bedrag = keyboard.nextInt();
		System.out.println(bedrag/20);
		
		keyboard.close();
	}

}
