package evaluacion1;

import java.util.Scanner;

public class Primocub {

	public static void main(String[] args) {
		// lee un número por teclado y muestra por pantalla si el número es o no primo
		int n,posicion,resto;
		boolean esprimo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		while (n>=0){
			if ((n % 2)==0){
				// si es par calculo su cubo
				System.out.println("El cubo de " + n + " es " + (n*n*n));
			}
			else {
				// si es impar compruebo si es primo
				// compruebo si n es primo
				esprimo = true;
				posicion=2;
				while(posicion < n){
					resto = n % posicion;
					if (resto == 0){
						esprimo = false;
						break;
					}
					posicion = posicion + 1;
				}
				if (esprimo){
					System.out.println(n + " es primo.");
				}
				else{
					System.out.println(n + " NO es primo.");
				}
			}
			// leo otro n
			System.out.print("Introduzca un valor de tipo entero: ");
			n = teclado.nextInt();
		}
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
	}

}
