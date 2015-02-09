package problem_5;

import java.util.Vector;

import matematica.Matematica;

public class TernaPitagorica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number=500;
		int b=0;
		int pow=2;
		int i=0;
		int risultato=0;
		Vector<Integer> vector=new Vector<Integer>();
		System.out.println(Math.log(8));
		for(int index=2;index<=number;index++){
			if(Matematica.isPrime(index))
			{
				for(pow=1;pow<=9;pow++)
				{			
				
				int a=(int)Math.pow(index,pow);
				System.out.println(index+" elevato a "+pow+" è "+a );
				if(a<number)
				b=a;							
				}	
				vector.add(b);

			}
			//System.out.println(b);
		}
		//System.out.println(b);
		for(int num:vector)
			System.out.print(num+" ");
		risultato=vector.elementAt(0);
		for(i=1;i<=vector.size()-1;i++){
			risultato=risultato*vector.elementAt(i);
			
			
		}
		System.out.println(risultato);
	}

}
