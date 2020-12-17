package evaluacion1;

import java.util.Scanner;

public class Rangosum {

	public static void main(String[] args) {
		// Pide dos números enteros por teclado y 
		// calcula la suma de los números enteros que hay 
		// desde el primero hasta el segundo ambos inclusive
		int n1,n2;
		int posicion;
		int suma;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n1
		System.out.print("Introduzca un valor de tipo entero: ");
		n1 = teclado.nextInt();
		
		// leo n1
		System.out.print("Introduzca un valor de tipo entero: ");
		n2 = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		suma = 0;
		posicion = n1;
		while (posicion <= n2){
			suma = suma + posicion;
			posicion = posicion + 1;
		}
		System.out.print("Suma = " + suma);
	}

}
