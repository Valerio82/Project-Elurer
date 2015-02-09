package problem_12;

public class HighDivisibleTriangularNumber {

	/**
	 * @param args 150554628
	 */
	public static void main(String[] args) {

		Triangular triangular=new Triangular();
		long timeStart=System.currentTimeMillis();
		int number=1338187008;
		int Tn;
		int index=1;
		int counter;
		do{
			number++;
			Tn=triangular.TriangularNumber(number);
			counter=0;
			for(index=1;index<=Tn;index++){
				if(Tn%index==0){
					counter++;
				}
			}
			System.out.println(Tn+" ha "+counter+" divisori");
		}while(counter!=500);
		long timeStop=System.currentTimeMillis();
		long executionTime=(timeStop-timeStart);
		System.out.println("Il numero Triangolare con 500 divisori è "+Tn);
		System.out.println("Il tempo impiegato per trovare il numero è "+executionTime);
	}

}
