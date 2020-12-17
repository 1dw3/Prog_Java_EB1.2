package ebaluaketa1;

import java.util.Scanner;

//PR_1_14 AGERTUERREALA. Programa honek zenbaki erreal bat ateratzen du pantailatik
public class osoaerreala1{
	//Metodo nagusia
	public static void main(String[] args) {
		Scanner teklatua = new Scanner(System.in);
		double znbk=0;
		int osoa;
		System.out.println("Sartu zenbaki hamartar bat: ");
		znbk=teklatua.nextDouble();
		
		
		osoa=(int)znbk;
		System.out.println("osoa: "+osoa);
		double hamartarra=znbk-osoa;
		System.out.println();
		System.out.println("hamartarra: "+hamartarra);

	}

}
