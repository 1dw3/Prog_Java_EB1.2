package ebaluaketa1;

import java.util.Scanner;

public class Triacowa {

	public static void main(String[] args) {
		// pide un número n por teclado y muestra la siguiente salida en pantalla
		int n,filas,fila,columna;
				
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el triangulo
		filas = n;
		fila = 1;
		while(fila <= filas){
			// columnas = n - (fila-1);
			columna = fila;
			while (columna <= n){
				System.out.print(columna+"\t");
				columna = columna + 1;
			}
			// paso a la siguiente fila
			System.out.println();
			fila = fila + 1;
		}
			
	}

}
