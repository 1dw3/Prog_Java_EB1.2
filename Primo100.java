package eb1;

public class Primo100 {

	public static void main(String[] args) {
		// lee un número por teclado y muestra por pantalla si el número es o no primo
		int n,posicion,resto;
		boolean esprimo;
		int contador;
		
		//escribo los 3 primeros números primos
		contador=3;
		System.out.print("1 2 3 ");
		//em piezo a calcular primos desde el número 5
		n=5;
		
		//calculo los 100 primeros números primos
		while (contador <= 100){
			
			// compruebo si n es primo
			esprimo = true;
			// compruebo si es par
			if((n%2) == 0){
				esprimo = false;
			}
			else {
				//si es impar
				posicion=3;
				while(posicion < n){
					resto = n % posicion;
					if (resto == 0){
						esprimo = false;
						break;
					}
					posicion = posicion + 2;
				}
			}
			if (esprimo){
				// si es primo
				System.out.print(n + " ");
				contador = contador + 1;
			}
			// independientemente de si es primo o no
			// paso al siguiente número n
			// solo compruebo número impares
			n = n + 2;
		}
	}

}
