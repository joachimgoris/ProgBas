package Extra;

import java.util.Scanner;

public class oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int gesl,afgKm, countM=0, countV=0, count=0;
		double conditiegetal;
		System.out.println("Geef geslacht");
		gesl = keyboard.nextInt();
		while(gesl==1||gesl==2) {
			System.out.println("Geef km");
			afgKm = keyboard.nextInt();
			conditiegetal = (((double)afgKm*1000)-504.9)/44.73;
			count++;
			if(gesl ==1&&conditiegetal<36) 
				 countM++;
			if(gesl==2&&conditiegetal<29)
				countV++;
			
			System.out.println("Geef geslacht");
			gesl = keyboard.nextInt();
		}
		System.out.println("Mannenn: "+countM/count);
		System.out.println("Vrouwen: "+countV/count);
		keyboard.close();
	}

}
