package problem_20;

import java.util.ArrayList;

import matematica.Matematica;

public class Fattoriale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		ArrayList <Long> arrayList=new ArrayList<Long>(1);
		long somma=0;
		long startTime=System.currentTimeMillis();
		//System.out.println(Matematica.fattoriale(10));
		arrayList=Matematica.digitNumber(Matematica.fattoriale(100));
		System.out.println(arrayList);
		for(int index=0;index<arrayList.size();index++){
			somma+=arrayList.get(index);
		}
		long stopTime=System.currentTimeMillis();
		System.out.println(somma);
		System.out.println("Tempo di esecuzione = "+(stopTime-startTime));
	}

}
