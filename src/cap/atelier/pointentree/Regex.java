package cap.atelier.pointentree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		// EX 1
		System.out.print("Email = ");
		Scanner scanner = new Scanner( System.in );
		String email = scanner.next();
		
		Pattern pattern = Pattern.compile("^([a-z,A-Z,0-9,.]{1,})@([a-z]{1,}.[a-z]{1,10})$");
		Matcher matcher = pattern.matcher( email );
		boolean caMatchOuPas = matcher.find();
		
		if( caMatchOuPas==false ) {
			System.out.println( "Email non valide !" );
		}
	}

}
