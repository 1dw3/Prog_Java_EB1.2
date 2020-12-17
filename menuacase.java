package eb1;
import java.util.Scanner;
public class menuacase {

	public static void main(String[] args) {

		// Menua aurkezten du eta aukeraren arabera eragiketa bat edo beste bat egiten du
		// aukerako egitura bat erabiliz
		
		int aukera,znbk1,znbk2,emaitza;
		
		// Scanner klaseko objektua deklaratu teklatua izenekoa
		Scanner teklatua = new Scanner(System.in);
		
		// menua aurkeztu
		System.out.println("1.Batu");
		System.out.println("2.Kendu");
		System.out.println("3.Biderkatu");
		System.out.println("4.Zatitu");
		System.out.println("5.Ondarra (%)");
		System.out.println("0.Irten");
		
		//  aukera irakurri
		System.out.print("Aukera: ");
		aukera = teklatua.nextInt();
		
		if (aukera==0) {
			System.out.println("Agur");
			
			
		}else {
			
			if (aukera>0 && aukera<=5){
				System.out.print("znbk1 = ");
				znbk1 = teklatua.nextInt();
				// znbk2 irakurri
				System.out.print("znbk2 = ");
				znbk2 = teklatua.nextInt();
				switch (aukera){
					
					case 1:
						emaitza = znbk1 + znbk2;
						System.out.print( znbk1 + " eta " + znbk2 + " ren batuketa  " + emaitza+ " da ");
						break;
					case 2:
						
						emaitza = znbk1 - znbk2;
						System.out.print( znbk1 + " eta " + znbk2 + " ren kenketa  " + emaitza+ " da ");
						break;
					case (2+1):
						
						emaitza = znbk1 * znbk2;
						System.out.print( znbk1 + " eta " + znbk2 + " ren biderketa  " + emaitza+ " da ");
						break;
					case 4:
						
						znbk2 = teklatua.nextInt();
						
						if (znbk2 != 0){ 
							emaitza = znbk1 / znbk2;
							System.out.println( znbk1 + " eta " + znbk2 + " ren zatiketa  " + emaitza+ " da ");
						}
						else {
							System.out.println("Akatza. Zero zatitzailea");
						}
						break;
					case 5:
						
						
						if (znbk2 != 0){ 
							emaitza = znbk1 % znbk2;
							System.out.println( znbk1 + " eta " + znbk2 + " ren zatiketaren ondarra  " + emaitza+ " da ");
						}
						else {
							System.out.println("Akatza. Zero zatitzailea");
						}
						break;
					
						
				}
			}else {
				System.out.println("Aukera ez egokia");
				}
		}
		// Scanner klaseko objektua itxi
		teklatua.close();
	}
}
