package oef;

import java.util.Scanner;

public class oef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int inschrijvingsnr, sUren, sMinuten, sSeconden; 
		int count=0;
		double percentage=0;
		long tijd, sTijd=0;
		
		System.out.println("Geef het inschrijvingsnr");
		inschrijvingsnr = keyboard.nextInt();
		while(inschrijvingsnr>0) {
			System.out.println("Geef de tijd in seconden");
			tijd = keyboard.nextLong();
			count++;
			if(tijd>sTijd)
				sTijd = tijd;
			if(tijd>3600) {
				percentage++;
			}
			
			System.out.println("Geef het inschrijvingsnr");
			inschrijvingsnr = keyboard.nextInt();
		}
		sUren = (int)sTijd/3600;
		sTijd -= sUren*3600;
		sMinuten = (int)sTijd/60;
		sTijd -= sMinuten*60;
		sSeconden = (int)sTijd;
		System.out.println("Uren: "+sUren+" Minuten: "+sMinuten+" Seconden: "+sSeconden);
		percentage = percentage/count;
		
		keyboard.close();
	}

}
