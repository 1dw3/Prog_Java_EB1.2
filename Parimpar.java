package evaluacion1;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		// el valor de un número entero por teclado y muestra por pantalla si es par o impar 
		
		int n;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// compruebo si es par o impar
		if ((n % 2) == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
}
