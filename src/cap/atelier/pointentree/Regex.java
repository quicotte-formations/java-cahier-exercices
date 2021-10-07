package cap.atelier.pointentree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		// EX 1
		// System.out.print("Email = ");
		// Scanner scanner = new Scanner( System.in );
		// String email = scanner.next();
		//
		// Pattern pattern =
		// Pattern.compile("^([a-z,A-Z,0-9,.]{1,})@([a-z]{1,}.[a-z]{1,10})$");
		// Matcher matcher = pattern.matcher( email );
		// boolean caMatchOuPas = matcher.find();
		//
		// if( caMatchOuPas==false ) {
		// System.out.println( "Email non valide !" );
		// }

		// EX 2
		// System.out.println("Prénom : ");
		// Scanner scan = new Scanner(System.in);
		// String prenom = scan.next();
		// Pattern pattern = Pattern.compile("^[A-Z,a-z,-, ]{2,}$");
		// Matcher matcher = pattern.matcher( prenom );
		// if( matcher.matches() ) {// Equivalent à == true
		// System.out.println("Valide");
		// }else {
		// System.out.println("Non-valide!");
		// }

		// EX 3 : Petit bug, pr l'instant aucune explication ; (
		// System.out.println("Adresse au format '70 Boulevard Gambetta, 75020 Paris' :
		// ");
		// Scanner scan = new Scanner(System.in);
		// String adresse = scan.nextLine();
		// if( adresse.matches("([0-9]{1,5})[ ]{1}([A-Z,a-z,-,é, ]{2,50})[
		// ]{1}([0-9]{5})[ ]{1}([A-Z,a-z,-,é]{2,30})") ) {// Equivalent à == true
		// System.out.println("Valide");
		// }else {
		// System.out.println("Non-valide!");
		// }

		// EX 4
		System.out.println("Entrez prenom nom, age : ");
		Scanner scan = new Scanner(System.in);
		String texte = scan.nextLine();
		Pattern pattern = Pattern.compile("^([a-z,A-Z,-]{2,}) ([a-z,A-Z,-]{2,}), ([0-9]{1,3})$");
		Matcher matcher = pattern.matcher(texte);
		if (matcher.matches() == true) {
			String prenom = matcher.group(1);
			String nom = matcher.group(2);
			int age = Integer.parseInt(matcher.group(3));
			
			System.out.println( String.format("Prenom=%s Nom=%s Age=%d", prenom, nom, age) );
		}else {
			System.out.println("Erreur de formattage");
		}
	}
}
