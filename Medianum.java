package evaluacion1;

import java.util.Scanner;

public class Medianum {

	public static void main(String[] args) {
		// lee números por pantalla y los almacena en un array hasta que se introduzca 
		// un número negativo que no será tenido en cuenta. 
		// Después calcula la Media y la muestra.
		final int tamañomaximo=10;
		int numeroelementos;
		int n,posicion;
		int [] arrayenteros = new int [tamañomaximo];
		double media;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
		
		// inicializo numeroelementos
		numeroelementos = 0;
		while((numeroelementos < tamañomaximo) && (n >= 0)){
			arrayenteros[numeroelementos]=n;
			numeroelementos = numeroelementos + 1;
			// leo otro n
			System.out.print("Introduzca un valor de tipo entero: ");
			n = teclado.nextInt();
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo la media
		media=0.0;
		posicion = 0;
		while (posicion < numeroelementos){
			media = media + arrayenteros[posicion];
			posicion=posicion+1;
		}
		media = media / numeroelementos;
		// muestro el resultado
		System.out.println("Media: "+ media);	
	}

}
