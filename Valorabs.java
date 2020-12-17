package evaluacion1;

import java.util.Scanner;

public class Valorabs {

	public static void main(String[] args) {
		// llee el valor de un número real por teclado y muestra su valor absoluto
		
		double n;
		double valorabsoluto;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo real: ");
		
	// lee un número real por teclado
			n = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculamos su valor absoluto
		if (n < 0) {
			valorabsoluto = -n;
		}
		else {
			valorabsoluto = n;
		}

		// muestro el mensaje
		System.out.println("El valor absoluto de " + n + " es " + valorabsoluto);
		
	}

}
