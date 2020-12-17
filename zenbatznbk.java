package ebaluaketa1;

import java.util.Scanner;

public class zenbatznbk {

	public static void main(String[] args) {
		// Zenbakiak pantailatik irakurri eta estatistika egiten du
		int znbk,i,e;
		int imax=0, imin=1000;
		
		int arrayznbk[]={0,0,0,0,0};
		arrayznbk[0]=0;
		arrayznbk[1]=0;
		arrayznbk[2]=0;
		arrayznbk[3]=0;
		arrayznbk[4]=0;
		arrayznbk = new int [5];
		
		/*for (i=0;i<5;i++){
			arrayznbk[i]=0;
		}*/

		// scanner klaseko elementua definitu
		Scanner teklatua = new Scanner(System.in);
		
		// znbk irakurri
		System.out.print("Sartu zenbaki bat: ");
		znbk = teklatua.nextInt();
	
		while (znbk!=0){
			arrayznbk[znbk-1]++;
			System.out.print("Sartu zenbaki bat: ");
			znbk = teklatua.nextInt();
		}
		for(i=0;i<5;i++){
			System.out.print(i+1+" zenbakia "+arrayznbk[i]+" bider atera da \n");
			if (arrayznbk[i]>imax){
				imax=i+1;
						
			}
			if (arrayznbk[i]<imin){
				imin=i+1;
						
			}
		}
		System.out.print("Gehien agertu den zenbakia "+imax+" da \n");
		System.out.print("Gutxien agertu den zenbakia "+imin+" da \n");
		for(i=0;i<5;i++){
			if (arrayznbk[i]==0){
				System.out.print(i+1+" zenbakia ez da baten ere atera \n");
			}
		}
	
		// teklatua itxi
		teklatua.close();
		
		
		
		
			
	}

}
