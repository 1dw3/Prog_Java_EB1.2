package evaluacion1;

import java.util.Scanner;

public class Sacaparw {

	public static void main(String[] args) {
		// lee pide un número entero por teclado y 
		// muestra los números desde 1 hasta él inclusive. Con MIENTRAS
		int n;
		int posicion;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		posicion = 0;
		while (posicion <= n){
			System.out.print(posicion + " ");
			posicion = posicion + 2;
		}
		
	}

}
