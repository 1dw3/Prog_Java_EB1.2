package evaluacion1;

import java.util.Scanner;

public class Menudias {

	public static void main(String[] args) {
		// muestra un men� y, en funci�n de la opci�n, pide dos n�meros enteros por pantalla 
		// y calcula una operaci�n usando una estructura selectiva.
		
		char opcion;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		//muestro el menu
		System.out.println("L Lunes");
		System.out.println("M Martes");
		System.out.println("X Mi�rcoles");
		System.out.println("J Jueves");
		System.out.println("V Viernes");
		System.out.println("S S�bado");
		System.out.println("D Domingo");
		
		// leo opcion
		System.out.print("Opci�n: ");
		opcion = teclado.next().charAt(0);
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		switch (opcion){
			case 'L':
			case 'l':
				System.out.println("Lunes");
				break;
			case 'M':
			case 'm':
				System.out.println("Martes");
				break;
			case 'X':
			case 'x':
				System.out.println("Mi�rcoles");
				break;
			case 'J':
			case 'j':
				System.out.println("Jueves");
				break;
			case 'V':
			case 'v':
				System.out.println("Viernes");
				break;
			case 'S':
			case 's':
				System.out.println("S�bado");
				break;
			case 'D':
			case 'd':
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Error");
		}
		
	}
}
