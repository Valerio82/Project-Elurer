package problem_2;

public class SommaFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a=1;
		int b=1;
		int c=0;
		int somma=0;
		System.out.print(a+" "+b+" ");
		while(c<10){

			c=a+b;
			somma+=c;
			a=b;
			b=c;
			
		}
		System.out.println();
		System.out.println(somma);

		
	}

	
}
