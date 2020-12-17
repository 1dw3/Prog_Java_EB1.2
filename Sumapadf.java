package evaluacion1;

import java.util.Scanner;

public class Sumapadf {

	public static void main(String[] args) {
		// pide un n�mero entero por teclado y 
		// muestra la suma de todos los n�meros pares desde 0 hasta n (en orden descendente).
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
		
		for(suma = 0,posicion = n-(n % 2);posicion > 0;posicion = posicion - 2){
			suma = suma + posicion;
		}
		System.out.print("Suma = " + suma);
	}

}
