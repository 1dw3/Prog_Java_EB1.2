package evaluacion1;

import java.util.Scanner;

public class Mediatem {

	public static void main(String[] args) {
		// Pide temperaturas por pantalla y las almacena en un array 
		// hasta que se introduzca la temperatura -999 que no será tenida en cuenta. 
		// Después calcula la temperatura media y muestra el número de temperaturas 
		// que son mayores que la media, iguales que la media, e inferiores a la media
		final int tamañomaximo=10;
		int numeroelementos;
		double n;
		int posicion;
		double [] arraytemperaturas = new double [tamañomaximo];
		double media;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca una Temperatura (-999 para Fin): ");
		n = teclado.nextDouble();
		
		// inicializo numeroelementos
		numeroelementos = 0;
		while((numeroelementos < tamañomaximo) && (n >= 0)){
			arraytemperaturas[numeroelementos]=n;
			numeroelementos = numeroelementos + 1;
			// leo otro n
			System.out.print("Introduzca una Temperatura (-999 para Fin): ");
			n = teclado.nextDouble();
		}
	
		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		if (numeroelementos > 0){
			// si se han introducido números
		
			// calculo la media
			media=0.0;
			posicion = 0;
			while (posicion < numeroelementos){
				media = media + arraytemperaturas[posicion];
				posicion=posicion+1;
			}
			media = media / numeroelementos;
			
			// muestro el resultado
			System.out.println("Media: "+ media);
			
			// compruebo cuantas temperaturas son mayores, iguales, o menores que la media
			int mayores=0;
			int iguales=0;
			int menores=0;
			posicion = 0;
			while (posicion < numeroelementos){
				if(arraytemperaturas[posicion] > media){
					// si el valor es mayor que la media
					mayores = mayores + 1;
				}
				else if (arraytemperaturas[posicion] == media){
					// si el valor es igual que la media
					iguales = iguales + 1;
				}
				else {
					// si el valor es menor que la media
					menores = menores + 1;
				}
				// paso a la siguiente posicion
				posicion = posicion + 1;
			}
			
			// muestro el resultado
			System.out.println("Hay " + mayores + " temperaturas mayores que la media");
			System.out.println("Hay " + iguales + " temperaturas iguales que la media");
			System.out.println("Hay " + menores + " temperaturas menores que la media");
		}
		else{
			// si no se ha introducido ningún número válido
			System.out.println("Error. No se ha introducido ningún número válido.");
		}
	}

}
