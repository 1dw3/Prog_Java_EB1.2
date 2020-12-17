package evaluacion1;

import java.util.Scanner;

public class Traspues {

	public static void main(String[] args) {
		// pide la introducción de los datos de una matriz por pantalla, 
		// traspone la matriz, y 
		// muestra la matriz traspuesta por pantalla
		
		int n;
		int filas,columnas;
		int fila,columna;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo filas
		System.out.print("Introduzca el número de filas de la matriz: ");
		filas = teclado.nextInt();
		
		// leo filas
		System.out.print("Introduzca el número de columnas de la matriz: ");
		columnas = teclado.nextInt();
		
		// creo la matriz
		int [][] matriz = new int[filas][columnas];

		// pido los datos de la matriz
		for (fila=0;fila < matriz.length;fila++){
			for (columna=0;columna < matriz[fila].length;columna++){
				// leo el valor de esa posicion
				System.out.print("matriz["+fila+"]["+columna+"]= ");
				n = teclado.nextInt();
				matriz[fila][columna]=n;
			}
		}
		
		// muestra el contenido de matriz
		for (fila=0;fila < matriz.length;fila++){
			for (columna=0;columna < matriz[fila].length;columna++){
				// escribo el valor de esa posicion
				System.out.print(matriz[fila][columna]+ " ");
			}
			// escribo un salto de línea
			System.out.println();
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// creo la matriz traspuesta
		int [][] matriztraspuesta = new int[columnas][filas];
		
		// recorro matriz para dar valores a matriztraspuesta
		for (fila=0;fila < matriz.length;fila++){
			for (columna=0;columna < matriz[fila].length;columna++){
				// pongo el valor de la celda en matriztraspuesta
				matriztraspuesta[columna][fila]=matriz[fila][columna];
			}
		}
		
		// muestra el contenido de matriztraspuesta
		for (fila=0;fila < matriztraspuesta.length;fila++){
			for (columna=0;columna < matriztraspuesta[fila].length;columna++){
				// escribo el valor de esa posicion
				System.out.print(matriztraspuesta[fila][columna]+ " ");
			}
			// escribo un salto de línea
			System.out.println();
		}
		
		
		
	}

}
