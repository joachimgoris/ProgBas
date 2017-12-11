package Extra;

import java.util.Scanner;

public class oef17 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double percentage, kapitaal, bKapitaal;
		int jaren = 0;

		System.out.println("Geef percentage en kapitaal");
		percentage = keyboard.nextDouble();
		kapitaal = keyboard.nextDouble();
		bKapitaal = kapitaal;
		while (kapitaal < 2 * bKapitaal) {
			kapitaal *= percentage;
			jaren++;
			if (jaren == 1000)
				break;
		}
		if (jaren == 1000)
			System.out.println("Geef een realistische rentevoet");
		else
			System.out.println(jaren);
		keyboard.close();
	}

}
