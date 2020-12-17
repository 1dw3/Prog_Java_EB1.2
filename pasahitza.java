package ebaluaketa1;

import java.util.Scanner;

public class pasahitza {

	public static void main(String[] args) {
		// pantailatik izena eta pasahitza eskatzen du
		// array baten konparatu eta egokiak diren edo ez esango du
		// hiru saiakera izango ditu
		
		String A_izenak [] ={"ana", "jon", "aitor", "rakel", "iñigo"};
		String A_pasahitzak [] ={"1111", "2222", "3333", "4444", "5555"};
		//A_izenak =new String [10];
		int i;
		
		
		
		String izena;
		String pasahitza;
		int saiakerak;
		boolean egokia;
		
		// scanner klaseko elementua definitu
				Scanner teklatua = new Scanner(System.in);
		
		
		
		egokia = false;
		saiakerak = 1;
		do {
			// izena irakurri
			System.out.print("Erabiltzailea: ");
			izena = teklatua.next();
								
			// pasahitza irakurri
			System.out.print("Pasahitza: ");
			pasahitza = teklatua.next();
			for (i=0;i<5;i++){
					if (izena.equals(A_izenak[i]) && pasahitza.equals(A_pasahitzak[i])){
						egokia = true;

					}
				}
			if (!egokia) System.out.println("Ez daukazu baimenik sartzeko.  " 
					+ (3-saiakerak) + " saiakera duzu oraindik.");
			
			saiakerak = saiakerak + 1;
		}while (saiakerak <= 3 && !egokia );
			System.out.println("Ok");
		if (egokia){
			System.out.println("Ongi etorri " + izena);
		}
		
		else {
			System.out.println("Ez daukazu sartzeko baimenik. Saiakera kopurua gainditu duzu");
		}
		
		
		teklatua.close();
			
	}
}


