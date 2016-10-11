package lab2;
/* Wakacje zawieraj�c� opis wakacji (kraj, miejscowo��, hotel, termin, wy�ywienie itp).
 *  Klasa ma posiada� konstruktor oraz metody wy�wietlaj�ce cen� (przy zadanym pokoju i terminie).
W programie g��wnym stworzy� kilka obiekt�w klasy Wakacje (np.Grecja,W�ochy,Hiszpania) 
i na podstawie przyk�adowych danych wy�wietli� wszystkie informacje.
 */
public class Wakacje {	
	
	public String kraj;
	public String miejscowo��;
	public String hotel;
	public String termin;
	public String wy�ywienie;
	public String cena;
	
	public Wakacje(String kraj, String miejscowo��, String hotel, String termin, String wy�ywienie, String cena) {
		super();
		this.kraj = kraj;
		this.miejscowo�� = miejscowo��;
		this.hotel = hotel;
		this.termin = termin;
		this.wy�ywienie = wy�ywienie;
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
		str += "miejscowo��: " + miejscowo�� + "\r\n";
		str += "hotel: " + hotel + "\r\n";
		str += "termin: " + termin + "\r\n";
		str += "wy�ywienie: " + wy�ywienie + "\r\n";
		str += "cena: " + cena + "\r\n";
		return str;
	}
	
}
