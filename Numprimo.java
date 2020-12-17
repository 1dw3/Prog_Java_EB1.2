package evaluacion1;

import java.util.Scanner;

public class Numprimo {

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

}
