package oef;

import java.util.Scanner;

public class oef15 {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			int temperatuur,a=0,b=0;
			for(int i = 0; i<10;i++) {
				temperatuur = keyboard.nextInt();
				if(temperatuur>a)
					a = temperatuur;
				b += temperatuur;
			}
			b /=10;
			System.out.println(a);
			System.out.println(b);
			keyboard.close();
	}

}
