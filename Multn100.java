package evaluacion1;

import java.util.Scanner;

public class Multn100 {

	public static void main(String[] args) {
		// Pide un n�mero entero por teclado y muestra por pantalla sus 100 primeros m�ltiplos
		int n,posicion,resultado;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		//muestro la tabla de n
		posicion=1;
		while(posicion <= 100){
			resultado = n * posicion;
			System.out.print(resultado + " ");
			posicion = posicion + 1;
		}
	}

}
