package ebaluaketa1;
//PR_1_26 zirkuluzera. Programa honek erradioa  hartzen du teklatutik 
//eta ateratzen du zirkuluaren luzera
import java.util.Scanner;


public class zirkuluzera {
Scanner teklatua=new Scanner (System.in);
	public static void main(String[] args) {
		Scanner teklatua=new Scanner (System.in);
		double erradioa;
		double luzera;
		
		System.out.println("Egunon, ongi etorri gure aplikaziora");
		System.out.println("Mesedez, sartu zirkuluaren erradioa: ");
		erradioa=teklatua.nextDouble();
		luzera=2*Math.PI*erradioa;
		System.out.printf("%.2f erradioa duen zirkulu baten luzera %.2f da ", 
				erradioa, luzera);
		teklatua.close();
		


	}

}
