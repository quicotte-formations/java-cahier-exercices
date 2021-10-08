package cap.atelier.pointentree.poo;

public class Horloge {

	private int heure;
	private int min;
	private int sec;
	
	public Horloge(int heure, int min, int sec) {
		this.setHeure(heure);
		this.setMin(min);
		this.setSec(sec);
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		if( heure>=0 && heure<=23 ) {
			this.heure = heure;
		}else {
			this.heure = 0;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if( min>=0 && min<=59 ) {
			this.min = min;
		}else {
			this.min = 0;
		}
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {

		if( sec>=0 && sec<=59 ) {
			this.sec = sec;
		}else {
			this.sec = 0;
		}
	}
	@Override
	public String toString() {
		
		return String.format("%d:%d:%d", this.heure, this.min, this.sec);
	}
	
	public void avanceUneSec() {
		this.sec++;// sec+=1 ou sec = sec=sec+1
		if(this.sec>59) {
			this.sec=0;
			this.min++;
			if(this.min>59) {
				this.min=0;
				this.heure++;
				if(this.heure>23) {
					this.heure=0;
				}
			}
		}
	}
	
	
}
