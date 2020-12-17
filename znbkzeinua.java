package ebaluaketa1;
//PR_1_24 znbkzeinua. Programa honek zenbaki oso bat hartzen du teklatutik 
// eta ateratzen du pantailatik zeinua aldatuta
import java.util.Scanner;
public class znbkzeinua{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int znbk;
		System.out.println("Ongi etorri gure aplikazioetara\n");
		System.out.println("Sartu zenbaki oso bat:");
		znbk=teklatua.nextInt();
		znbk=-znbk; 
		System.out.printf
		("Sartutako zenbakia zeinua aldatuta %d da %n", znbk);
		teklatua.close();
		System.out.println("\n\nEskerrik asko, ondo izan");
		

	}

}
