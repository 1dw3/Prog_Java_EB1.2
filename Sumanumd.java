package evaluacion1;

import java.util.Scanner;

public class Sumanumd {

	public static void main(String[] args) {
		// pide un numero entero por teclado y 
		// muestra la suma de todos los números hasta el inclusive
		int n;
		int posicion;
		int suma;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);

		do {
			// lee un número entero por teclado
			System.out.print("Introduce un valor entero positivo: ");
			n = teclado.nextInt();
		}while (n < 0);
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		suma = 0;
		posicion = 1;
		while (posicion <= n){
			suma = suma + posicion;
			posicion = posicion + 1;
		}
		System.out.print("Suma = " + suma);
	}

}
