package evaluacion1;

import java.util.Scanner;

public class Notavali {

	public static void main(String[] args) {
		// Pide la nota de un alumno por teclado y muestra por pantalla si es válida o no, 
		// sabiendo que es válida si está entre 0 y 10
		double nota;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo la nota
		System.out.print("Introduzca la Nota: ");
		nota = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if((nota >= 0.0) && (nota <= 10.0)) {
			System.out.print("Válida");
		}
		else {
			System.out.print("NO Válida");
		}
		
	}

}
