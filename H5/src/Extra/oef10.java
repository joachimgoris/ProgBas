package Extra;

import java.util.Scanner;

public class oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int jaar;
		System.out.println("Geef jaar");
		jaar = keyboard.nextInt();
		if(jaar%400==0) {
			System.out.println(true);
		} else {
			if(jaar%100==0) {
				System.out.println(false);
			} else {
				if(jaar%4==0) {
					System.out.println(true);
				} else {
					System.out.println(false);
				}
			}
		}
		keyboard.close();
	}

}
