package evaluacion1;

import java.util.Scanner;

public class Sumanumf {

	public static void main(String[] args) {
		// pide un numero entero por teclado y 
		// muestra la suma de todos los n�meros hasta el inclusive
		int n;
		int posicion;
		int suma;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un n�mero entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		for(suma = 0,posicion = 1;posicion <= n;posicion = posicion + 1){
			suma = suma + posicion;
		}
		System.out.print("Suma = " + suma);
	}

}
