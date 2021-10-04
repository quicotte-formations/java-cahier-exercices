package cap.atelier.pointentree;

public class Tableaux {

	public static void main(String[] args) {
		
		// EX 1
//		int[] valeurs = {10,20,30};
//		int taille = valeurs.length;
//		System.out.println( taille );
		
		// EX 2
//		int[] valeurs = new int[3];
//		System.out.println( valeurs[3] );
		
		// EX 3
		int[] valeurs = {10,20,0};
		int somme = valeurs[0] + valeurs[1];
		valeurs[2] = somme;
		
		// EX 4
		int[] nombres1 = {10,20,30};
		int[] nombres2 = {40,50};
		int[] nombres = new int[ nombres1.length + nombres2.length ];
		
		nombres[0] = nombres1[0];
		nombres[1] = nombres1[1];
		nombres[2] = nombres1[2];
		nombres[3] = nombres2[0];
		nombres[4] = nombres2[1];
		
		System.out.println( nombres ); 
	}

}
