package eb1;

import java.util.Scanner;

public class notak {
	public static void main(String[] args) {
		
		// Karaktere bi eskatu eta asteko eguna emango du
		// aukerako egitura bat erabiliz
		
		int nota;
		
		// Scanner klaseko objektua deklaratu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
		
		//Noten balioak jarri
		String nota1="Oso gutxi";
		String nota2="Gutxi";
		String nota3="Nahiko";
		String nota4="Ondo";
		String nota5="Oso ondo";
		String nota6="Bikain";
		
		//  aukera irakurri
		System.out.print("Nota: ");
		nota = teklatua.nextInt();
		
		// Scanner klaseko objektua itxi
		teklatua.close();
		
		
		// Kasu guztiak behatu
		switch (nota){
			case 0:
				
			case 1:
				
			case 2:
				System.out.println(nota1);
				break;
			case 3:
				
			case 4:
				System.out.println(nota2);
				break;
			case 5:
				System.out.println(nota3);
				break;
			case 6:
				System.out.println(nota4);
				break;
			case 7:
				
				
			case 8:
				System.out.println(nota5);
				break;
			case 9:
				
			case 10:
				System.out.println(nota6);
				break;
			
			
			// lehenetsita dagoen kasua, beste guztiak ez badira betetzen
			default:
				System.out.println("Errorea");
				
				
			(int a, int b) ­>  a + b;
			(int a) ­> a +  1;
			(int  a, int b) ­> { System.out.println(a + b);  return a + b; } () ­> new ArrayList();
		}
		
	}
}

