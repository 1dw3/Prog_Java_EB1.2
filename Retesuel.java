package evaluacion1;

import java.util.Scanner;

public class Retesuel {

	public static void main(String[] args) {
		// Lee el sueldo de un trabajador por teclado y muestra por pantalla 
		// la retención que se le aplica sabiendo que si
		// sueldo < 1000.00 retencion 10%
		// sueldo 1000.00 retencion 12%
		// sueldo < 2000.00 retencion 14% 
		// sueldo 2000.00 retencion 16% 
		// sueldo > 2000.00 retencion 18%

		double sueldo,retencion;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// informo al usuario de lo que tiene que hacer
		System.out.print("Introduzca el sueldo: ");
		
		// lee un número real por teclado
		sueldo = teclado.nextDouble();
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (sueldo < 1000.0) {
			retencion = sueldo * 0.10;
		}
		else {
			if (sueldo == 1000.0) {
				retencion = sueldo * 0.12;
			}
			else {
				if (sueldo < 2000.0) {
					retencion = sueldo * 0.14;
				}
				else {
					if (sueldo == 2000.0) {
						retencion = sueldo * 0.16;
					}
					else {
						retencion = sueldo * 0.18;
					}
				}
			}
		}
		// muestro el mensaje
		System.out.println("La retención de " + sueldo + " es " + retencion);
	}

}
