package ebaluaketa1;
//PR_2_05 txikiagohandiago. Programa honek, zenbaki bi eskatu eta konparatu egiten ditu


import java.util.Scanner;

public class txikiagohandiago {
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double znbk1,znbk2;
		System.out.println("Ongi etorri gure aplikazioetara!!!");
		System.out.println("Sartu lehen zenbakia: ");
		znbk1=teklatua.nextDouble();
		System.out.println("Sartu bigarren zenbakia: ");
		znbk2=teklatua.nextDouble();
		
		if (znbk1!=znbk2){
			if (znbk1<znbk2){
				System.out.println("Lehenengo zenbakia bigarrena baino txikiagoa da");
			}
			else{
				System.out.println("Lehenengo zenbakia bigarrena baino handiagoa da");
			}
		}
		else{
			System.out.println("Zenbakiak berdinak dira");
		}
		
		teklatua.close();
		
	}

}
