package Extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class oef9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		input = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date2=null;
		Date date3 = new Date();
		try {
			date2 = dateFormat.parse(input);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date2);
		long a = date3.getTime() - date2.getTime();
		scanner.close();
	}	
}
