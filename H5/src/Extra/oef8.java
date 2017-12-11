package Extra;

import java.util.ArrayList;

public class oef8 {

	public static void main(String[] args) {
		double a = Math.random(), b = Math.random(), c = Math.random();
		
		ArrayList<Object> array = new ArrayList<Object>();
		
		array.add(a);
		array.add(b);
		array.add(c);
		array.sort(null);
		System.out.println(array.get(0)+" "+array.get(1)+" "+array.get(2));
	}

}
