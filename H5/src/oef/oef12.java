package oef;

import java.util.Scanner;

public class oef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double percentageM, percentageJ, percentagem;
		
		System.out.println("Geef percentages");
		percentageM = keyboard.nextDouble();
		percentageJ = keyboard.nextDouble();
		percentagem = keyboard.nextDouble();
		System.out.println("Aarde \t Maan \t Jupiter \t Mars");
		keyboard.close();
		
		for(int i = 50; i<120;i+=5)
		{
			System.out.println(i +"\t"+ (i*(percentageM/100))+"\t"+(i*(percentageJ/100))+"\t"+(i*(percentagem/100)));
		}
	}

}
