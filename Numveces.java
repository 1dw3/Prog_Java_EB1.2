package evaluacion1;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// lee un número por teclado y muestra por pantalla si el número es o no primo
		int n,posicion;
		int [] arrayenteros;
		arrayenteros = new int [10];

		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
	
		while(n >= 0){
			arrayenteros[n]=arrayenteros[n]+1;
			// leo otro n
			System.out.print("Introduzca un valor de tipo entero: ");
			n = teclado.nextInt();
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el resultado
		posicion = 0;
		while (posicion <= 9){
			System.out.println("Número "+posicion+": "+ arrayenteros[posicion] + " veces.");
			posicion=posicion+1;
		}
			
	}

}
