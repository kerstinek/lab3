package lab2;
/* Wakacje zawierającą opis wakacji (kraj, miejscowość, hotel, termin, wyżywienie itp).
 *  Klasa ma posiadać konstruktor oraz metody wyświetlające cenę (przy zadanym pokoju i terminie).
W programie głównym stworzyć kilka obiektów klasy Wakacje (np.Grecja,Włochy,Hiszpania) 
i na podstawie przykładowych danych wyświetlić wszystkie informacje.
 */
public class Wakacje {	
	
	public String kraj;
	public String miejscowość;
	public String hotel;
	public String termin;
	public String wyżywienie;
	public String cena;
	
	public Wakacje(String kraj, String miejscowość, String hotel, String termin, String wyżywienie, String cena) {
		super();
		this.kraj = kraj;
		this.miejscowość = miejscowość;
		this.hotel = hotel;
		this.termin = termin;
		this.wyżywienie = wyżywienie;
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
		str += "miejscowość: " + miejscowość + "\r\n";
		str += "hotel: " + hotel + "\r\n";
		str += "termin: " + termin + "\r\n";
		str += "wyżywienie: " + wyżywienie + "\r\n";
		str += "cena: " + cena + "\r\n";
		return str;
	}
	
}
