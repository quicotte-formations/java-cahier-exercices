package cap.atelier.pointentree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesEtHeures {

	public static void main(String[] args) {
		
		/*
		 * A partir de la date et l'heure systèmes,
		 * 1. uniquement afficher au format 12:56 : LocalTime
		 * 2. afficher en bonus : Wed 6 Oct 21  : LocalDate
		 */
		
		// 1  A partir de la date et l'heure systèmes, 
		// afficher au format 12:56
		DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("HH : mm");
		LocalTime heure = LocalTime.now();
		System.out.println( heure.format(formatterFR) );
		
		// 1  A partir de la date et l'heure systèmes, 
		// affiche : Wed 6 Oct 21
		DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("E d MMM yy");
		LocalDate date = LocalDate.now();
		System.out.println( date.format(formatterUS) );
	}
}
