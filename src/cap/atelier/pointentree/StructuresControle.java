package cap.atelier.pointentree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StructuresControle {

	public static void main(String[] args) {

		// EX 1
//		Scanner scan = new Scanner( System.in );
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if(a>b) {
//			System.out.println(">");		
//		}else if(a<b) {
//			System.out.println("<");		
//		}else {
//			System.out.println("=");		
//		}
		
		// EX 2
		ArrayList<Integer> entiers = new ArrayList<>();
		Scanner scan = new Scanner( System.in );
		int entier;
		do {// Entre données ds liste
			System.out.println("Entrez un nombre entier : ");
			entier = scan.nextInt();
			entiers.add(entier);
		}while( entier!=0 );
		
		for(int entierActuel : entiers) {
			System.out.println( entierActuel );
		}
	}

}
