package ebaluaketa1;
//PR_1_27 zirkuluazalera. Programa honek erradioa  hartzen du teklatutik 
//eta ateratzen du zirkuluaren azalera
import java.util.Scanner;


public class zirkuluazalera {
Scanner teklatua=new Scanner (System.in);
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double erradioa;
		double azalera;
		System.out.println("Egunon, ongi etorri gure aplikaziora");
		System.out.println("Mesedez, sartu zirkuluaren erradioa: ");
		erradioa=teklatua.nextDouble();		
		azalera=Math.PI*Math.pow(erradioa, 2);
		System.out.printf("%.2f erradioa duen zirkulu baten azalera %.2f da ", 
				erradioa, azalera);
		teklatua.close();
		


	}

}
