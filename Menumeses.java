package evaluacion1;

import java.util.Scanner;

public class Menumeses {

	public static void main(String[] args) {
		// muestra un menú y, en función de la opción, pide dos números enteros por pantalla 
		// y calcula una operación usando una estructura selectiva.
		
		String opcion;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo opcion
		System.out.print("Escribe el nombre del mes: ");
		opcion = teclado.next();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		switch (opcion){
			case "enero":
			case "Enero":
			case "ENERO":
				System.out.println("1");
				break;
			
			default:
				System.out.println("Error");
		}
		
	}
}
