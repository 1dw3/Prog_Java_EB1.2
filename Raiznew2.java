package evaluacion1;

import java.util.Scanner;

public class Raiznew2 {

	public static void main(String[] args) {
		// Calcula la raíz cuadrada de un número por el método de Newton. 
		// Este método consiste en calcular términos hasta que el valor absoluto de la diferencia 
		// entre el término actual y el anterior sea menor que una cantidad de Error determinada 
		// (en nuestro caso ERROR=0.00000001). Inicialmente Ranterior es la mitad del número. 
		// Para el cálculo de la raíz se utiliza la formula
		// Ractual=((Numero/Ranterior)+(Ranterior))/2

		double n,ractual, ranterior, error;
		final double errordefinido = 0.00000001;
		
		// defino un objeto de la clase Scanner y de nombre teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.print("Introduzca un valor de tipo real: ");
		n = teclado.nextDouble();

		// cierro el objeto de la clase Scanner y de nombre teclado para liberar recursos
		teclado.close();
		
		// calculo su raiz cuadrada
		ractual=n;
		ranterior = n/2;
		error=1;
		while(error > errordefinido){
			ractual=((n/ranterior)+ranterior)/2;
			error=ranterior-ractual;
			if (error < 0){
				error = -error;
			}
			ranterior=ractual;
		}
		// Muestro el resultado
		System.out.println("SQRT("+ n + ")= " + ractual);
		
			
	}

}
