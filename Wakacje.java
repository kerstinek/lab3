package lab2;
/* Wakacje zawieraj¹c¹ opis wakacji (kraj, miejscowoœæ, hotel, termin, wy¿ywienie itp).
 *  Klasa ma posiadaæ konstruktor oraz metody wyœwietlaj¹ce cenê (przy zadanym pokoju i terminie).
W programie g³ównym stworzyæ kilka obiektów klasy Wakacje (np.Grecja,W³ochy,Hiszpania) 
i na podstawie przyk³adowych danych wyœwietliæ wszystkie informacje.
 */
public class Wakacje {	
	
	public String kraj;
	public String miejscowoœæ;
	public String hotel;
	public String termin;
	public String wy¿ywienie;
	public String cena;
	
	public Wakacje(String kraj, String miejscowoœæ, String hotel, String termin, String wy¿ywienie, String cena) {
		super();
		this.kraj = kraj;
		this.miejscowoœæ = miejscowoœæ;
		this.hotel = hotel;
		this.termin = termin;
		this.wy¿ywienie = wy¿ywienie;
		this.cena = cena;
	}
	public Wakacje() {
		super();
	}


	public String getCena() {
		return this.cena;
	}
	
	public String toString() {
		String str = "";
		str += "kraj: " + kraj + "\r\n";
		str += "miejscowoœæ: " + miejscowoœæ + "\r\n";
		str += "hotel: " + hotel + "\r\n";
		str += "termin: " + termin + "\r\n";
		str += "wy¿ywienie: " + wy¿ywienie + "\r\n";
		str += "cena: " + cena + "\r\n";
		return str;
	}
	
}
