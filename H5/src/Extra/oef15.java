package Extra;

import java.util.Scanner;

public class oef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal, max, count = 0;
		do {
			count++;
			System.out.println("Oefening: "+count);
		System.out.println("Geef vermenigvuldiger en max");
		getal = keyboard.nextInt();
		max = keyboard.nextInt();
		for(int i=0; i<=max; i++)
		{
			System.out.println(i*getal);
		}
		}while(count<5);
		
		keyboard.close();
	}

}
