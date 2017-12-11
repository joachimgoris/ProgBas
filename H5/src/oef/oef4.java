package oef;

import java.util.Scanner;

public class oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int h, m, s;
		System.out.println("seconden");
		s = keyboard.nextInt();

		h = s / 3600;
		s = s-h*3600;
		m = s / 60;
		s = s-m*60;

		System.out.println(h + "h " + m + "m " + s+"s");
		keyboard.close();

	}

}
