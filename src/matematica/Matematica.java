package matematica;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Vector;

public class Matematica {

	public static boolean isPrime(long number){
		
		BigInteger bigInteger=new BigInteger(Long.toString(number));
		if(bigInteger.isProbablePrime(100))
			return true;
			else
				return false;
		
	}
	
	public static long nEsimoNumeroTriangolare(long number){
		
		long Tn=(number*(number+1))/2;
		
		return Tn;
	}
	
	/*public static Vector<Integer> fattorizzazione(int number){
		
		int c=2;
		Vector<Integer> vector=new Vector<Integer>(1,1);		
		while(number>1){			
			if(number%c==0){
				number=number / c;
				vector.add(c);
			}
			else
				c++;
		}
				
		return vector;
		
	}*/
	
	public static boolean palindromo(int number){
		
		String string;
		String subString;
		string=Integer.toString(number);
		subString=string.substring(0,string.length()/2);
		string=string.substring(string.length()/2,string.length());
		string=new StringBuffer(string).reverse().toString();
		if(string.compareTo(subString)==0){
			return true;
		}
		else return false;
	}
	
	public static boolean ternaPitagorica(int firstNumber,int secondNumber,int result){
		
		
		if((Math.pow(firstNumber,2)+Math.pow(secondNumber,2))==Math.pow(result,2))		
			return true;
			else return false;
				
	}
	
	public static ArrayList<Long> digitNumber(String arg0){
		
		//Restituisce un ArrayList, ad ogni indice dell'array è inserita
		//la cifra che compone il numero.
		
		String string;
		string=arg0;
		ArrayList<Long> arrayList=new ArrayList<Long>(1);
		 	arrayList.ensureCapacity(string.length());
			for(int index=0;index<string.length();index++){
			long numero=Character.getNumericValue(string.charAt(index));
			arrayList.add(numero);
			
		}
		return arrayList;
	}
	
	public static String fattoriale(int arg0){
	
		String string;
		string=Integer.toString(arg0);
		BigInteger n=new BigInteger(string);
		BigInteger fattoriale=new BigInteger("1");
		BigInteger bitInteger1=new BigInteger("1");
		String risultato;
		while(arg0>1){
		fattoriale=fattoriale.multiply(n);
		System.out.println("fattoriale vale "+fattoriale);
		n=n.subtract(bitInteger1);
		System.out.println("n vale "+n);
		arg0--;
		}
		return 
				risultato=fattoriale.toString();
			
	}
	
	public static ArrayList<Integer> fattorizzazione(int number){
		
		int c=2;
		ArrayList<Integer> arrayList=new ArrayList<Integer>(1);		
		while(number>1){			
			if(number%c==0){
				number=number / c;
				arrayList.add(c);
			}
			else
				c++;
		}
				
		return arrayList;
		
	}
}
