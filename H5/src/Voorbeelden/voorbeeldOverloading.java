package Voorbeelden;

public class voorbeeldOverloading {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 7;
		
		int som = berekenSom(a,b);
		System.out.println("de eerste som is "+som);
		
		int som2 = berekenSom(a,b,c);
		System.out.println("de tweede som is "+som2);
	}

	private static int berekenSom(int a, int b, int c) {
		int retvalue =a+b+c;
		return retvalue;
	}

	private static int berekenSom(int a, int b) {
		int retvalue = a+b;
		return retvalue;
	}
}
