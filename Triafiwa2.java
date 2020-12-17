package eb1;
import java.util.Scanner;
public class Triafiwa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sartuko dugu zenbaki bat
		int znbk,errenkadak,errenkada,zutabea;
				
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teklatua = new Scanner(System.in);
		
		// znbk irakurri
		System.out.print("Sartu balio oso bat: ");
		znbk = teklatua.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teklatua.close();
		
		// triangelua atera
		errenkadak = znbk;
		errenkada = znbk;
		while (errenkada>=1) {
			zutabea=1;
			while (zutabea<=errenkada) {
				System.out.print(errenkada);
				System.out.print("\t");
				zutabea++;
			}
			System.out.print("\n");
			errenkada--;
		}
	}

}
