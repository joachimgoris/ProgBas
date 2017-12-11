package Extra;

import java.util.Scanner;

public class oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int beginKapitaal, jaren;
		double intrestvoet, eindKapitaal;
		System.out.println("Geef kapitaal");
		beginKapitaal = keyboard.nextInt();
		System.out.println("Geef intrestvoet");
		intrestvoet = keyboard.nextDouble();
		System.out.println("Geef jaren");
		jaren = keyboard.nextInt();
		
		for(int i=1; i<jaren;i++) {
			eindKapitaal = beginKapitaal *Math.pow((1+intrestvoet), i);
			System.out.println(eindKapitaal);
		}
		
		keyboard.close();
	}

}
