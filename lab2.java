package lab2;
import java.lang.Object;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.Scanner;

public class lab2  {
	public static int odejmowanie(int a, int b) throws MyException  {	
		int c = a-b;
		if (c < 0 ) {
			throw new MyException();
		}
		return c;
	}

	public static void main(String[] args) {
		System.out.println("Przykladowy wyjatek");
		try {
			System.out.println(odejmowanie(5,10));

		} catch (MyException e) {
			e.printStackTrace();
			e.getMessage();
			e.printErrorCode();
		} catch (Throwable t) {


		} finally {
			//kod zawsze wykonywalny
		}
		
		Wakacje wakacje1 = new Wakacje("Polska", "Karków", "Pod Palmami", "12.12.16 - 18.12.16", "szwedzki stó³", "1000");
		Wakacje wakacje2 = new Wakacje("Awganistan", "Hahankon", "Lusterbani", "12.12.16 - 18.12.16", "brak", "1234");
		Wakacje wakacje3 = new Wakacje("Polska", "Wroc³aw", "Entnismo", "12.12.16 - 18.12.16", "obiad + kompot", "1880");
		System.out.println("\r\n\r\nPrzykladowe wpisy");
		System.out.println(wakacje1.toString());
		System.out.println(wakacje2.toString());
		System.out.println(wakacje3.toString());

		
		Scanner klawiatura = new Scanner(System.in);
		System.out.println("Podaj ilsoc hoteli ktore chcesz dodac: ");
		while (!klawiatura.hasNextInt()) {
			System.out.println("To nie byla liczba, podaj jeszcze raz");
			klawiatura.next();
		}
		Wakacje[] tab = null;
		int count = klawiatura.nextInt();	
		try {
		tab = new Wakacje[count];
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
		for (int i = 0; i < count; i++) {
			Wakacje wak = new Wakacje();
			System.out.println("Obiekt numer: " + i+1);
			System.out.println("Podaj kraj: ");
			wak.kraj = klawiatura.next();
			System.out.println("Podaj miejscowoœæ: ");
			wak.miejscowoœæ = klawiatura.next();
			System.out.println("Podaj hotel: ");
			wak.hotel = klawiatura.next();
			System.out.println("Podaj termin: ");
			wak.termin = klawiatura.next();
			System.out.println("Podaj wy¿ywienie: ");
			wak.wy¿ywienie = klawiatura.next();
			System.out.println("Podaj cena: ");
			wak.cena = klawiatura.next();
			
			tab[i] = wak;
		}
		
		//utowrzeni pliku
		File file = new File("plik.txt");
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Wpisy uzytkownika");
		for (int i = 0; i < count; i++) {
			System.out.println(tab[i].toString());
			try {
				writer.write(tab[i].toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}



}


class MyException extends Exception{
	public String desciption = "Liczba mniejsza od 0"; 

	public MyException() { 
	}

	public String getMessage() {
		System.out.println("Liczba mniejsza od 0");
		return desciption;
	}

	public void printErrorCode() {
		System.out.println("ErrorCode: 666");
	}
}
