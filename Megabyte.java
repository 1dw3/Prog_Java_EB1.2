package evaluacion1;

import java.util.Scanner;

public class Megabyte {

	public static void main(String[] args) {
		// Pide un tamaño expresado en bytes por teclado, y 
		// muestra por pantalla el número de Mbytes, Kbytes, y Bytes equivalente
		int n;
		int b, kb, mb;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
			
		// leemos n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo las cifras
		mb = n / (1024 * 1024);
		kb = (n - (mb * 1024 * 1024))/1024;
		b = n - (mb * 1024 * 1024) - (kb * 1024);
		
		// muestro el resultado
		if (mb > 0){
			System.out.print(mb + " Mbytes ");
		}
		if (kb > 0){
			System.out.print(kb + " Kbytes ");
		}
		if (b > 0){
			System.out.print(b + " Bytes ");
		}
	}

}
