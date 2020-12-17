package ebaluaketa1;
//PR_2_08 MXN. Programa honek segundo bat gehitzen dio orduari


import java.util.Scanner;

public class segundo {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		int o, m, s;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu orduak: ");
		o=teklatua.nextInt();
		System.out.println("Sartu minutuak: ");
		m=teklatua.nextInt();
		System.out.println("Sartu segundoak: ");
		s=teklatua.nextInt();
		s=s+1;
		if (s==60){
			s=0;
			m=m+1;
		}
		if (m==60){
			m=0;
			o=o+1;
		}
		System.out.printf ("Ordu berria %d ordu, %d minutu eta %d segundo da ", o,m, s);
		teklatua.close();
		
	}

}
