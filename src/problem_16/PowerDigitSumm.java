package problem_16;

import java.math.BigInteger;
import java.util.ArrayList;

import matematica.Matematica;

public class PowerDigitSumm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int pow=1000;
		long summ=0;
		BigInteger big=new BigInteger("2");
		System.out.println("2 elevato a pow è " +big.pow(pow));
		String stringa;
		stringa=big.pow(pow).toString();
		ArrayList<Long> arrayList=new ArrayList<Long>(1);
		arrayList=Matematica.digitNumber(stringa);
		System.out.println(arrayList);
		System.out.println("la capacita del vettore è "+arrayList.size());
		for(int index=0;index<arrayList.size();index++){
			summ+=arrayList.get(index);
		}
		System.out.println(summ);
		
		
		}
	}

