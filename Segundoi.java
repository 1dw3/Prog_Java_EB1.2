package evaluacion1;

import java.util.Scanner;

public class Segundoi {

	public static void main(String[] args) {
		// Lee una hora con sus minutos y segundos por teclado, 
		// la incrementa un segundo y la muestra por pantalla
		int hora, minutos, segundos;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo la hora
		System.out.print("Hora: ");	
		hora = teclado.nextInt();
		
		// leo los minutos
		System.out.print("Minutos: ");	
		minutos = teclado.nextInt();
		
		// leo los segundos
		System.out.print("Segundos: ");	
		segundos = teclado.nextInt();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		segundos = segundos + 1;
		
		if (segundos == 60) {
			segundos = 0;
			minutos = minutos + 1;
			if (minutos == 60) {
				minutos=0;
				hora = hora + 1;
			}
		}
		
		// muestro el mensaje
		System.out.println(hora + "h " + minutos +"m " + segundos + "s");
		
	}

}
