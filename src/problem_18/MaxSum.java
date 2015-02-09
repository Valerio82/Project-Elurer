package problem_18;

public class MaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int array[][]=new int[4][5];
		int indexRighe=0;
		int indexColonne=0;
		int sum=0;
		array[0][0]=3;
		array[1][0]=7;
		array[1][1]=4;
		array[2][0]=2;
		array[2][1]=4;
		array[2][2]=6;
		array[3][0]=8;
		array[3][1]=5;
		array[3][2]=9;
		array[3][3]=3;
		sum=array[0][0];
		for(indexRighe=1;indexRighe<4;indexRighe++){
			indexColonne=0;
			int massimo=array[indexRighe][indexColonne];
			for(indexColonne=0;indexColonne<5;indexColonne++){
				if(array[indexRighe][indexColonne]>massimo)
					massimo=array[indexRighe][indexColonne];
				System.out.println("Il massimo della riga "+indexRighe+" è "+massimo);
			}
			sum+=massimo;
			
		}
		System.out.println(sum);
	}

}
