package problem_9;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] arrayA=new int[999];
		int[] arrayB=new int [999];
		int[] arrayC=new int[999];
		int numero=1;
		for(int i=0;i<999;i++){
			arrayA[i]=numero;
			arrayB[i]=numero;
			arrayC[i]=numero;
			numero++;
		}
		for(int indexC=999-1;indexC>0;indexC--){
			for( int indexB=0;indexB<999;indexB++){				
				for(int indexA=0;indexA<999;indexA++){
					int a=arrayA[indexA];
					int b=arrayB[indexB];
					int c=arrayC[indexC];
					if(a+b+c==1000){
						int a2=(int)Math.pow(a, 2);
						int b2=(int)Math.pow(b,2);
						int c2=(int)Math.pow(c,2);
						if((a2<b2)&&(b2<c2)&& (a2+b2==c2)){
							System.out.println("a= "+a+" b= "+b+" c= "+c);	
							System.out.println("Il prodotto tra a,b,c è "+a*b*c);
			   }		}
			}		
		}		
	}
}
}