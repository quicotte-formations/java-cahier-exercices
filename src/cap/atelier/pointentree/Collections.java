package cap.atelier.pointentree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {

		// EX 1
//		Scanner scanner = new Scanner( System.in);
//		ArrayList<String> nombres = new ArrayList<>();
//		
//		String n = scanner.next(); // VERSION LONGUE
//		nombres.add(n);
//		n = scanner.next();
//		nombres.add(n);
//		n = scanner.next();
//		nombres.add(n);
		
//		nombres.add( scanner.next() );// VERSION COURTE
//		nombres.add( scanner.next() );
//		nombres.add( scanner.next() );
		
		
		// EX 2
//		ArrayList<String> nombres = new ArrayList<>();
//		
//		nombres.add("10");
//		nombres.add("20");
//		nombres.add(0, "5");
		
		// EX 3
//		ArrayList<String> couleurs1 = new ArrayList<>();
//		couleurs1.add("rouge");
//		couleurs1.add("vert");
//		couleurs1.add("bleu");
//		
//		ArrayList<String> couleurs2 = new ArrayList<>();
//		couleurs2.add("rouge");
//		couleurs2.add("jaune");
//		
//		couleurs1.addAll( couleurs2 );
//		
//		System.out.println( couleurs1 );
		
		// EX 4
//		HashSet<String> couleurs1 = new HashSet<>();
//		couleurs1.add("rouge");
//		couleurs1.add("vert");
//		couleurs1.add("bleu");
//		
//		HashSet<String> couleurs2 = new HashSet<>();
//		couleurs2.add("rouge");
//		couleurs2.add("jaune");
//		
//		couleurs1.addAll( couleurs2 );
//		
//		System.out.println( couleurs1 );
		
		// EX 5
//		HashSet<Integer> entiers1 = new HashSet<>();
//		entiers1.add(1);
//		entiers1.add(2);
//		entiers1.add(3);
//		entiers1.add(4);
//		entiers1.add(5);
//		HashSet<Integer> entiers2 = new HashSet<>();
//		entiers2.add(1);
//		entiers2.add(2);
//		entiers2.add(3);
//		entiers1.removeAll(entiers2);
//		System.out.println(entiers1);
		
		// EX 6
		HashMap<String, String> paysCapitales = new HashMap<>();
		paysCapitales.put("Espagne", "Madrid");
		paysCapitales.put("Portugal", "Lisbonne");
		paysCapitales.put("Jamaique", "Kingston");
		System.out.println( paysCapitales.keySet() );
	}

}
