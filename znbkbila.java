package ebaluaketa1;

import java.util.Random;
import java.util.Scanner;

public class znbkbila {

	public static void main(String[] args) {
		// zenbaki bat asmatu eta saiatu zenbakia asmatzen.
		// sartutako zenbakia memorian dagoena baino handiagoa edo txikiagoa den adierazi
		// saiakera kopurua adierazi
		int znbk;
		//ausazko zenbakia sortu.
		//integer bat izango da 0-999 tartean
		Random znbkgordea= new Random();
		int znbkgordeaint=(znbkgordea.nextInt(10000));
		System.out.println(znbkgordeaint);
		int saiakerak;
		
		//beste aukera bat
		int znbk1=(int)(Math.random()*10000);
		System.out.println(znbk1);
		
		// scanner claseko objektua definitu
		Scanner teklatua = new Scanner(System.in);
		
		
		
		// znbk irakurri
		System.out.print("Sartu balio osoa: ");
		znbk = teklatua.nextInt();
		// saiakerak leheneratu
		saiakerak = 1;
		
		while (znbk != znbkgordeaint){
			//zenbakia egokia izan ez arte
			//System.out.println("Zenbakia: "+znbkgordeaint+ "zenbakia:"+znbk);
			// znbk txikiagoa bada
			if(znbk < znbkgordeaint){
				System.out.println(znbk + " txikiagoa da. Saiakerak: " + saiakerak);
			}
			else {
				//handiagoa bada
				System.out.println(znbk + " handiagoa da. Saiakerak: " + saiakerak);
			}
			// beste znbk irakurri
			System.out.print("Sartu zenbaki oso bat: ");
			znbk = teklatua.nextInt();
			//saiakerak leheneratu
			saiakerak = saiakerak + 1;
		}
		
		// teklatua itxi baliabideak askatzeko
		teklatua.close();
		
		//asmatzen duenean
		System.out.println(znbk + " Asmatu duzu, saiakerak: " + saiakerak);

		
	}

}
