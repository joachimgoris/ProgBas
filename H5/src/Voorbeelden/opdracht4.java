package Voorbeelden;

public class opdracht4 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		short res;
		
		res = (short)(a*b);
		System.out.println("de vermenigvuldiging is "+res);
		
		res = (short)(a/b);
		System.out.println("de deling is "+res);
		
		res =(short)(b%a);
		System.out.println("de module is "+res);
		
		float kommaResultaat;
		kommaResultaat = (float)b/a;
		System.out.println("de kommadeling is "+kommaResultaat);
		
		char teken = 'a';
		System.out.println("het teken is "+teken);
		teken++;
		System.out.println("het teken is "+teken);
		teken = (char)(teken+6);
		System.out.println("het teken is "+teken);
		teken--;
		System.out.println("het teken is "+teken);
	}

}
