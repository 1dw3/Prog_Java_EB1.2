package evaluacion1;

import java.util.Scanner;

public class Menucase {

	public static void main(String[] args) {
		// muestra un menú y, en función de la opción, pide dos números enteros por pantalla 
		// y calcula una operación usando una estructura selectiva.
		
		int opcion,n1,n2,resultado;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		//muestro el menu
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Resto (%)");
		System.out.println("0.Salir");
		
		// leo opcion
		System.out.print("Opción: ");
		opcion = teclado.nextInt();
		
		switch (opcion){
			case 0:
				System.out.println("Agur");
				break;
			case 1:
				// leo n1
				System.out.print("N1 = ");
				n1 = teclado.nextInt();
				// leo n2
				System.out.print("N2 = ");
				n2 = teclado.nextInt();
				resultado = n1 + n2;
				System.out.print("La suma de " + n1 + " y " + n2 + " es " + resultado);
				break;
			case 2:
				// leo n1
				System.out.print("N1 = ");
				n1 = teclado.nextInt();
				// leo n2
				System.out.print("N2 = ");
				n2 = teclado.nextInt();
				resultado = n1 - n2;
				System.out.print("La resta de " + n1 + " y " + n2 + " es " + resultado);
				break;
			case 3:
				// leo n1
				System.out.print("N1 = ");
				n1 = teclado.nextInt();
				// leo n2
				System.out.print("N2 = ");
				n2 = teclado.nextInt();
				resultado = n1 * n2;
				System.out.print("La multiplicación de " + n1 + " y " + n2 + " es " + resultado);
				break;
			case 4:
				// leo n1
				System.out.print("N1 = ");
				n1 = teclado.nextInt();
				// leo n2
				System.out.print("N2 = ");
				n2 = teclado.nextInt();
				
				if (n2 != 0){ 
					resultado = n1 / n2;
					System.out.println("La división entera de " + n1 + " entre " + n2 + " es " + resultado);
				}
				else {
					System.out.println("Error. División por cero");
				}
				break;
			case 5:
				// leo n1
				System.out.print("N1 = ");
				n1 = teclado.nextInt();
				// leo n2
				System.out.print("N2 = ");
				n2 = teclado.nextInt();
				
				if (n2 != 0){ 
					resultado = n1 % n2;
					System.out.println("El resto de " + n1 + " entre " + n2 + " es " + resultado);
				}
				else {
					System.out.println("Error. División por cero");
				}
				break;
			default:
				System.out.println("Opción Incorrecta");
		}
		
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
	}
}
