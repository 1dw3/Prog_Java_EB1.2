package ebaluaketa1;



public class pitagoras {

	public static void main(String[] args) {
		// Hurrengo formula hau betetzen duten zenbaki oso guztiak agertararazi non z<50
		

		int Z=1, X=1, Y=1;
		
		
		

		
		
		// zenbakiak kalkulatu
		for (Z=1; Z<=50;Z++){
			for (X=1;X<Z;X++){
				for (Y=1;Y<Z;Y++){
					if (Math.pow(Z, 2)==Math.pow(X, 2)+Math.pow(Y, 2)){
						System.out.printf(Z+"^2 = "+X+"^2 + "+ Y+ "^2\n");
					}
				}
			}
		}
		
		
			
	}

}
