package Voorbeelden;

import java.util.Random;

public class opdracht1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int getal = rand.nextInt();
		System.out.println(getal);
		
		getal = rand.nextInt(20);
		System.out.println(getal);
	}

}
