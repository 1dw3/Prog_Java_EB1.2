package evaluacion1;

import java.util.Scanner;

public class Signonum {

	public static void main(String[] args) {
		// lee un número entero por teclado, lo cambia de signo, y lo muestra por pantalla 
		int n;
		int signo;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca un valor de tipo entero: ");
		
		// lee un número entero por teclado
		n = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// lo cambia de signo
		signo = -n;
		
		// muestro el mensaje
		System.out.println("El valor de la variable cambiado de signo es " + signo);
		
	}

}
