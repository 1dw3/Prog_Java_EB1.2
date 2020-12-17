package evaluacion1;

import java.util.Scanner;

public class Numprimoimpar {

	public static void main(String[] args) {
		// lee un número por teclado y muestra por pantalla si el número es o no primo
		int n,posicion,resto;
		boolean esprimo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// compruebo si n es primo
		
		// como los pares son el 50% de los numeros
		// compruebo si es par
		resto = n % 2;
		if (resto == 0){
			esprimo = false;
		}
		else {
			// si es impar
			esprimo = true;
			posicion=3;
			while(posicion < n){
				resto = n % posicion;
				if (resto == 0){
					esprimo = false;
					break;
				}
				posicion = posicion + 2;
			}
		}
		// muestro el resultado
		if (esprimo){
			System.out.println(n + " es primo.");
		}
		else{
			System.out.println(n + " NO es primo.");
		}
			
	}

}
