package problem_4;

import matematica.Matematica;

public class Palindromo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int number=999;
		
		int risultato=number*number;
		
		boolean palindromo=false;
		
		while(palindromo==false)
		{
			if(Matematica.palindromo(risultato)==true)
			{
				int test=risultato;
				for(int i=number;i>=100;i--)
				{
					if((test%i==0) && (test/i)<number)
					{
						System.out.println(risultato+" è palindromo");
						palindromo=true;
						break;
					}	
				}		
			}
			risultato--;
		}
		
	}		

}
