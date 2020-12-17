package eb1;

import java.util.Scanner;

public class zuzenznbk {

	public static void main(String[] args) {
		// pide un número del teclado y escribe en pantalla un rectangulo numerico
		int znbk,ek,e,zk,z;
				
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		znbk = teklatua.nextInt();

		// teklatua itxi egiten dut
		teklatua.close();
		
		//laukia agertarazi
		ek = (znbk+(znbk%2))/2;
	
		for (e=1; e<=ek;e++){
			// zeroak
			//zk = e - 1;
		
			for (z=2; z <= e;z++){
				System.out.print("0 ");
				
			}
			// zenbakiak
			zk = znbk-2*(e - 1);
		
			for (z=e; z <=znbk-e+1;z++){
				System.out.print(z + " ");
				
			}
			// zeroak
			zk = e - 1;
			
			for (z = 1;z <= zk;z++){
				System.out.print("0 ");
				
			}
			// hurrengo lerroa
			System.out.println();
			//e = e + 1;
		}
		for (int i=1;i<=znbk;i++){
		System.out.print("0 ");
	
		}
		System.out.print("\n");
		//laukia atera
				ek = (znbk+(znbk%2))/2;
				
				for(e = ek;e >= 1;e--){
					// zeroak
					//zk = e - 1;
					
					for (z = 1; z < e; z++){
						System.out.print("0 ");
					
					}/*
					// zenbakiak
					//zk = znbk-2*(zk - 1);
					
					for (z = e;z<=znbk-e+1;e++){
						System.out.print((z) + " ");
						
					}
					// zeroak
					z = e - 1;
					z = 1;
					for (z = 1;z <= e;z++){
						System.out.print("0 ");
					
					}
					// hurrengo lerroa
					System.out.println();
					e = e + 1;*/
				}	
			
	}

}
