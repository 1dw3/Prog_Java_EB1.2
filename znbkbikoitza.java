package ebaluaketa1;
//PR_1_24 znbkbikoitza. Programa honek zenbaki oso bat hartzen du teklatutik 
// eta ateratzen du pantailatik bikoiztuta
import java.util.Scanner;
public class znbkbikoitza{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int znbk;
		System.out.println("Ongi etorri gure aplikazioetara\n");
		System.out.println("Sartu zenbaki oso bat:");
		znbk=teklatua.nextInt();
		znbk=znbk*2; 
		System.out.printf
		("Sartutako zenbakia bikoiztuta %d da %n", znbk);
		teklatua.close();
		System.out.println("\n\nEskerrik asko, ondo izan");
		

	}

}
