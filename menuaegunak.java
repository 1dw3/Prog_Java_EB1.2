package ebaluaketa1;

import java.util.Scanner;

public class menuaegunak {
	public static void main(String[] args) {
		
		// Karaktere bi eskatu eta asteko eguna emango du
		// aukerako egitura bat erabiliz
		
		String aukera;
		
		// Scanner klaseko objektua deklaratu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
		
		//menua aurkeztu
		System.out.println("AL Astelehena");
		System.out.println("AA Asteartea");
		System.out.println("AZ Asteazkena");
		System.out.println("OG Osteguna");
		System.out.println("OL Ostirala");
		System.out.println("LA Larunbata");
		System.out.println("IG Igandea");
		
		//  aukera irakurri
		System.out.print("Aukera: ");
		aukera = teklatua.next();
		
		// Scanner klaseko objektua itxi
		teklatua.close();
		
		switch (aukera){
			case "AL":
			case "al":
			case "aL":
			case "Al":
				System.out.println("Astelehena");
				break;
			case "AA":
			case "aa":
				System.out.println("Asteartea");
				break;
			case "AZ":
			case "az":
				System.out.println("Asteazkena");
				break;
			case "OG":
			case "og":
				System.out.println("Osteguna");
				break;
			case "OL":
			case "ol":
				System.out.println("Ostirala");
				break;
			case "LA":
			case "la":
				System.out.println("Larunbata");
				break;
			case "IG":
			case "ig":
				System.out.println("Igandea");
				break;
			default:
				System.out.println("Akatza");
		}
		
	}
}

