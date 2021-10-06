package cap.atelier.pointentree;

import java.util.ArrayList;
import java.util.Scanner;

public class Fonctions {
	
	/**
	 * Renvoie un string concaténant tous les strings passés en param, le tt en MAJ.
	 * @param mesStrings Les String en entrée
	 * @return
	 */
	public static String majuscules(String ... mesStrings) {
		
		String resultat = "";
		
		for(String stringAct : mesStrings) {
			resultat += stringAct + ", ";// res = res + stringAct + ", "
		}
		
		return resultat;
	}
	
	public static int carre(int n) {

		return puissance( n, 2);
	}
	
	public static int puissance(int n, int p) {

		int res = n;
		for(int i=0;i<p;i++) {
			res *= n;			
		}
		
		return n;
	}
	
	public static int factorielle(int n) {
		
		int res = n;
		for(n=n-1;n>1;n--) {
			res *= n;// res = res *n: n++, n--
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		// EX 7
		ArrayList<Integer> entiers = new ArrayList<>();
		entiers.add(10);
		entiers.add(20);
		entiers.add(30);
		entiers.add(42);
		
//		LAMBDA : NOTATION LONGUE
//		entiers.forEach(   (entierAct)->{
//			System.out.println( carre(entierAct) );
//		}    );
		
//		LAMBDA :  NOTATION COURTE
		entiers.forEach( elemActuel -> System.out.println( carre(elemActuel) ) );
		
		// EQUIVALENT FOR
//		for(Integer elemActuel : entiers) {
//			System.out.println("APPEL LAMBDA pour : " + elemActuel);
//		}
		
			
	}

}
