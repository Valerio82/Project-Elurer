package matematica;

import java.util.ArrayList;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number=1203;
		int sum=0;
		ArrayList<Long>arrayList=new ArrayList<Long>(1);		
		//System.out.println(Matematica.digitNumber(number));
		arrayList=Matematica.digitNumber("1203");
		for(int index=0;index<arrayList.size();index++){
			sum+=arrayList.get(index);
			System.out.println(arrayList.get(index));
		}
		System.out.println(sum);

}
}
