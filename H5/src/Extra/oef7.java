package Extra;

import java.util.Scanner;

public class oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int code, length,acode;
		double eprijs,iprijs, percentage,bedrag;
		System.out.println("Geef prijs");
		iprijs = keyboard.nextDouble();
		System.out.println("Geef code");
		acode = keyboard.nextInt();
		keyboard.close();
		length = Integer.toString(acode).length();
		code = Integer.parseInt(Integer.toString(acode).substring(length-1,1));
		switch(code){
			case 1:
				percentage = 0.06;
				break;
			case 2:
				percentage = 0.17;
				break;
			case 3:
				percentage = 0.19;
				break;
			case 4: 
				percentage = 0.25;
				break;
			case 5:
				percentage = 0.33;
				break;
			default:
				percentage = 0.21;
			}
		eprijs = iprijs *(1.0 - percentage);
		bedrag = iprijs - eprijs;
		System.out.println(percentage+" "+Math.round(eprijs)+" "+Math.round(bedrag));
		
	}

}
