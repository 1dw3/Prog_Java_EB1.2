package ebaluaketa1;

import java.util.Scanner;

public class zifrak {

	public static void main(String[] args) {
		// Guarda un n�mero en memoria y pide n�meros hasta que se acierta el n�mero 
		// El programa muestra si el n�mero introducido es mayor o menor que el almacenado 
		// en memoria as� como el n�mero de intentos que lleva el usuario
		int n,zifra;
		int cociente;
		int zifrak=0;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
			
		// leemos n
		System.out.print("Introduzca un valor de tipo entero: ");
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		
		
		int znb=n;		
		while  (n > 0){
			//mientras tengo cociente
			
		
			// calculo el cociente
			n = n / 10;
			zifrak++;
			System.out.println(n);
		}
		System.out.println(zifrak);
		//zifrak--;
		while  (zifrak > 0){
			//mientras tengo cociente
			zifra=(int) (znb/(Math.pow(10,zifrak-1 )));
			znb=(int)(znb-zifra*(Math.pow(10, zifrak-1)));
			//System.out.println(znb);
			//System.out.println(zifrak);
			System.out.println(zifra);
			//System.out.println("kaixo");
		
			// calculo el cociente
			//znb = znb / 10;
			zifrak--;
			//System.out.println(znb);
		}

	}

}
