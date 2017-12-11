package oef;

import java.util.Scanner;

public class oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int gewicht = 165, aantal, count = 1;
		
		System.out.println("Geef het aantal.");
		aantal = keyboard.nextInt();
		keyboard.close();
		
		for(int i=1; i<=aantal; i++) {
			System.out.println(i+"\t"+(gewicht*i));
		}
		while(count<aantal ) {
			count++;
			System.out.println(count+"\t"+(gewicht*count));
		}
	}

}
