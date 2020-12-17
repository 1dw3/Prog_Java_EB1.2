package ebaluaketa1;

import java.util.Scanner;

public class Rectanum {

	public static void main(String[] args) {
		// pide un número del teclado y escribe en pantalla un rectangulo numerico
		int n,filas,fila,columnas,columna;
				
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// muestro el triangulo
		filas = (n+(n%2))/2;
		fila = 1;
		while(fila <= filas){
			// ceros
			columnas = fila - 1;
			columna = 1;
			while (columna <= columnas){
				System.out.print("0 ");
				columna = columna + 1;
			}
			// numeros
			columnas = n-2*(fila - 1);
			columna = 1;
			while (columna <= columnas){
				System.out.print((fila + columna - 1) + " ");
				columna = columna + 1;
			}
			// ceros
			columnas = fila - 1;
			columna = 1;
			while (columna <= columnas){
				System.out.print("0 ");
				columna = columna + 1;
			}
			// paso a la siguiente fila
			System.out.println();
			fila = fila + 1;
		}
		for (int i=1;i<=n;i++){
		System.out.print("0 ");
	
		}
		System.out.print("\n");
		// muestro el triangulo
				filas = (n+(n%2))/2;
				fila = 1;
				while(fila <= filas){
					// ceros
					columnas = fila - 1;
					columna = 1;
					while (columna <= columnas){
						System.out.print("0 ");
						columna = columna + 1;
					}
					// numeros
					columnas = n-2*(fila - 1);
					columna = 1;
					while (columna <= columnas){
						System.out.print((fila + columna - 1) + " ");
						columna = columna + 1;
					}
					// ceros
					columnas = fila - 1;
					columna = 1;
					while (columna <= columnas){
						System.out.print("0 ");
						columna = columna + 1;
					}
					// paso a la siguiente fila
					System.out.println();
					fila = fila + 1;
				}	
			
	}

}
