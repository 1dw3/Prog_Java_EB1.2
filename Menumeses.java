package evaluacion1;

import java.util.Scanner;

public class Menumeses {

	public static void main(String[] args) {
		// muestra un men� y, en funci�n de la opci�n, pide dos n�meros enteros por pantalla 
		// y calcula una operaci�n usando una estructura selectiva.
		
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
