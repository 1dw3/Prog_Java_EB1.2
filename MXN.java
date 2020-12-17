package ebaluaketa1;
//PR_2_04 MXN. Programa honek, zenbaki bat eskatu eta berreketa egiten du


import java.util.Scanner;

public class MXN {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double znbk, ber;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu zenbakia: ");
		znbk=teklatua.nextDouble();
		ber=Math.pow(znbk, 2);
		if (ber>100){
			ber=ber-100;
			System.out.printf ("karradura 100 baino handiagoa da "
					+ "eta %.2f pasatzen da ehunetik", ber);
		}
		else{
			ber=100-ber;
			System.out.printf ("karradura 100 baino txikiagoa da "
					+ "eta %.2f falta zaio ehunerako", ber);
		}
		
		teklatua.close();
		
	}

}
