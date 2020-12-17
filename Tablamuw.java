package evaluacion1;

import java.util.Scanner;

public class Tablamuw {

	public static void main(String[] args) {
		// Modifica TABLAMUL para que el proceso se repita 
		// mientras que el número del que se quiere calcular su tabla sea distinto de 0
		int n,posicion,resultado;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		while (n != 0){
		
			//muestro la tabla de n
			posicion=1;
			while(posicion <= 10){
				resultado = n * posicion;
				System.out.println(n + " x " + posicion + " = " + resultado);
				posicion = posicion + 1;
			}
			
			// leo n
			System.out.print("Introduzca un valor de tipo entero: ");
			n = teclado.nextInt();
		}
		System.out.print("Agur");
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
	}

}
