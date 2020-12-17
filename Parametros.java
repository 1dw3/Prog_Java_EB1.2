package evaluacion1;

public class Parametros {

	public static void main(String[] args) {
		// parametros
		int n=5;
		
		// tipos predefinidos
		n=incrementar(n);
		System.out.println("n = " + n);
		
		// objetos
		String r="Hola.";
		referencia(r);
		System.out.println(r);
	}
	private static int incrementar(int n){
		return (n+1);
	}
	private static void referencia(String r1){
		r1 = r1 + " Adios.";
	}
}
