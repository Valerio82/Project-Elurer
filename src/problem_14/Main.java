package problem_14;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int number=1000000;
		
		int sequenceLenght=0;
		int startingNumber=0;
		long sequence=0;	
		int lenght=1;

		for(int i=2;i<=number;i++)
		{
			sequence=i;
			lenght=1;
			System.out.print("Le iterazioni di "+sequence+" sono ");
		while(sequence!=1){

			if(sequence%2==0){
				sequence=sequence/2;
				System.out.print(sequence+" ");
							}
			else{
				sequence=(3*sequence)+1;
				System.out.print(sequence+" ");
			}
			lenght++;
			
		  }
			System.out.println();
			if(lenght>sequenceLenght){
				sequenceLenght=lenght;
				startingNumber=i;
			}
		}
		System.out.println("Nei primi "+number+" numeri "+startingNumber+" ha effettuato "+lenght+" iterazioni");

	}

}
