package cap.atelier.pointentree;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		
		// Exercice 1
		System.out.println("Exercice 1 : ");
		String verre1 = "liquide vert";
		String verre2 = "liquide rouge";
		String verreIntermediaire = verre1;
		verre1 = verre2;
		verre2 = verreIntermediaire;
		System.out.println("Verre 1 : " + verre1 + " - Verre 2 : " + verre2);
		
		// Exercice 2
		System.out.println("Exercice 2 : ");
		System.out.println("Veuillez saisir un nombre : ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		System.out.println(Integer.parseInt(userInput) * 2);
		
		// Exercice 3
		System.out.println("Exercice 3 : ");
		String a = "1"; 
		String b = "2";
		int iA = Integer.parseInt(a);
		int iB = Integer.parseInt(b);
		int c = iA + iB;
		System.out.println(c);
		
		// Exercice 4 
		System.out.println("Exercice 4 : ");
		System.out.println(99%10);
		
		// Exercice 5
		System.out.println("Exercice 5 : ");
		System.out.println("Veuillez saisir un entier : ");
		String input = scanner.next();
		int n = Integer.parseInt(input);
		
		
		boolean pair = n%2 == 0;
		System.out.println("L'entier est pair ? : " + pair);
		
		// Exercice 6
		System.out.println("Exercice 6 : ");
		a = "10";
		b = "20";
		c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(c);
	}
}
