package problem_25;

import java.math.BigInteger;
import java.util.ArrayList;

import matematica.Matematica;

public class Fibonacci1000Digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int a=1;
		//int b=1;
		//int c=0;
		//int somma=0;
		int iterazione=0;
		//System.out.print(a+" "+b+" ");
		String string;
		ArrayList<Long>arrayList=new ArrayList<Long>(1);
		BigInteger c=new BigInteger("0");
		BigInteger a=new BigInteger("1");
		BigInteger b=new BigInteger("1");
		long counter=2;
		
		do{

			c=a.add(b);						
			a=b;
			b=c;
			System.out.print(c+" ");			
			arrayList=Matematica.digitNumber(c.toString());
			System.out.println(arrayList);
			//if(vector.size()==2)
				//break;
			//System.out.println(vector.size());
			counter++;
			
		}while(arrayList.size()!=1000);
		System.out.println(counter);
		

	}

}
