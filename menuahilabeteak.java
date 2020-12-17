package ebaluaketa1;

import java.util.Scanner;

public class menuahilabeteak {

	public static void main(String[] args) {
		// Hilabetea hizkiz eskatu eta zenbakia aterako du
		// aukera egiturarekin
		
		String aukera;
		
		// Scanner klaseko objektua deklaratu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
				
		// aukera irakurri
		System.out.print("Escribe el nombre del mes: ");
		aukera = teklatua.next();
		
		// Scanner klaseko objektua itxi
		teklatua.close();
		
		switch (aukera){
			case "urtarrila":
			case "Urtarrila":
			case "URTARRILA":
				System.out.println("1");
				break;
			case "otsaila":
			case "Otsaila":
			case "OTSAILA":
				System.out.println("2");
				break;
			
			default:
				System.out.println("Akatza");
		}
		
	}
}
