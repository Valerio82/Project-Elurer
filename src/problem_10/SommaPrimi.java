package problem_10;

import matematica.Matematica;

public class SommaPrimi {

	/**
	 * @param args 142999525375
	 */
	public static void main(String[] args) {
		
		long timeStart=System.currentTimeMillis();
		long index=1;		
		long sum=0;		
		while(index!=2000000)
		{			
			index++;
		
		if(Matematica.isPrime(index)==true)
			sum+=index;
				
		}
		long timeStop=System.currentTimeMillis();
		
		System.out.println("La somma dei numeri primi sotto i 2 milioni è"+sum);
		
		System.out.println("tempo impiegato per l'operazione "+(timeStop-timeStart));
		System.out.println(Matematica.nEsimoNumeroTriangolare(4));
	}
	

}
