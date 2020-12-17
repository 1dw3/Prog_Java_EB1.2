package evaluacion1;

import java.util.Scanner;

public class Nxn {

	public static void main(String[] args) {
		// Lee un número por teclado y calcula el cuadrado de ese número. 
		// Si el cuadrado es mayor  que 100 se le restara 100 y se mostrara por pantalla. 
		// Si no es mayor que 100, se mostrara lo que le falta para llegar a 100
		
		int n, cuadrado,resultado;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calcula el cuadrado de ese número
		cuadrado = n * n;
		
		if (cuadrado > 100) {
			resultado = cuadrado - 100;
			System.out.println("Pasa " + resultado + " de 100");
		}
		else {
			resultado = 100 - cuadrado;
			System.out.println("Falta " + resultado + " para 100");
		}
	}
}
