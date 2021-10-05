package cap.atelier.pointentree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StructuresControle {

	public static void main(String[] args) {

		// EX 1
		// Scanner scan = new Scanner( System.in );
		// int a = scan.nextInt();
		// int b = scan.nextInt();
		//
		// if(a>b) {
		// System.out.println(">");
		// }else if(a<b) {
		// System.out.println("<");
		// }else {
		// System.out.println("=");
		// }

		// EX 2
//		ArrayList<Integer> entiers = new ArrayList<>();
//		Scanner scan = new Scanner(System.in);
//		int entier;
//		do {// Entre données ds liste
//			System.out.println("Entrez un nombre entier : ");
//			entier = scan.nextInt();
//			entiers.add(entier);
//		} while (entier != 0);
//
//		for (int entierActuel : entiers) {
//			System.out.println(entierActuel);
//		}
		
		// EX 3 : calculer 2 exposant 16
//		int n = 2;
//		int exposant = 16;
//		int res = 1;
//		
//		for(int i=0; i<exposant; i++) {
//			res = res * n;
//		}
//		
//		System.out.println( res );
		
		// EX 4 : calculer factorielle de 8
//		int n = 8;
//		int res = n;
//		
//		for(n=n-1; n>1; n--) {
//			res = res * n;
//		}
//		
//		System.out.println( res );
		
		// 5 et 6
		Scanner scanner = new Scanner( System.in );
		String nouvellePartie;		
		do {
			// Partie
			int nbSecret = (int) (Math.random()*100);
			int proposition;
			int nbEssais = 0;
			do {
				System.out.print("Votre proposition : ");
				proposition = scanner.nextInt();
				if( nbSecret<proposition ) {
					System.out.println("Plus petit!");
					nbEssais++;
				}else if (nbSecret>proposition) {
					System.out.println("Plus grand!");
					nbEssais++;
				}
			}while(proposition!=nbSecret);
			System.out.println("Bravo, vous avez gagné en : " + nbEssais + " essais!");
			
			// Demande si nouv partie
			System.out.print("Voulez-vous rejouer (o/n) ?");
			nouvellePartie = scanner.next();
			
		} while( nouvellePartie.compareToIgnoreCase("o")==0 );
	}

}
