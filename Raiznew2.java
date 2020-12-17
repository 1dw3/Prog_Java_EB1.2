package evaluacion1;

import java.util.Scanner;

public class Raiznew2 {

	public static void main(String[] args) {
		// Calcula la ra�z cuadrada de un n�mero por el m�todo de Newton. 
		// Este m�todo consiste en calcular t�rminos hasta que el valor absoluto de la diferencia 
		// entre el t�rmino actual y el anterior sea menor que una cantidad de Error determinada 
		// (en nuestro caso ERROR=0.00000001). Inicialmente Ranterior es la mitad del n�mero. 
		// Para el c�lculo de la ra�z se utiliza la formula
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
