package cap.atelier.pointentree;

import java.util.Scanner;

public class Fonctions {

	
	public static void afficheNFois(String texte, int n) {
		for(int i=0;i<n;i++) {
			System.out.println( texte );
		}
	}
	
	public static String afficheMenuEtRenvoieChoix() {
		System.out.println("MENU");
		System.out.println("****");
		System.out.println("1 : Ajouter");
		System.out.println("2 : Soustraire");
		System.out.println("3 : Quitter");
		System.out.print("Votre choix : ");
		Scanner s = new Scanner(System.in);
		String choix = s.next();
		
		return choix;
	}
	
	public static void main(String[] args) {
		
		afficheNFois("coucou", 3);
		
		afficheNFois("hello", 10);
	}

}
