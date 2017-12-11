package Extra;

public class oef11 {

	public static void main(String[] args) {
		double C, F;
		System.out.println("Graden Celsius\tGraden Fahrenheit");
		for(int i = -40; i<=100;i+=10) {
			C = i;
			F = 1.8*C+32;
			System.out.println(C+"\t"+F);
		}
	}

}
