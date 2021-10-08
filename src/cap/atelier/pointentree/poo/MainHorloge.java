package cap.atelier.pointentree.poo;

public class MainHorloge {

	public static void main(String[] args) {

		Horloge h = new Horloge(23, 59, 59);
		h.avanceUneSec();
		System.out.println( h );
		h = new Horloge(10, 58, 59);
		h.avanceUneSec();
		System.out.println( h );
		h = new Horloge(10, 30, 10);
		h.avanceUneSec();
		System.out.println( h );
	}

}
