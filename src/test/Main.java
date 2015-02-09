package test;

import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[]array={2,3,5,7,8,2,3,6,9,9,3};
		Vector<Integer> vector=new Vector<Integer>();
		Vector<Integer> vector1=new Vector<Integer>();

		for(int i=0;i<=array.length-1;i++)
			vector.add(array[i]);
		for(int num:vector)
			System.out.print(num+" ");
		for(int index=0;index<=vector.size()-1;index++){
			int a=vector.elementAt(index);
			int i=index;
			for(int b =i+1;b<=vector.size()-1;i++){
				if(a==vector.elementAt(b))
					vector1.add(b);
			}
			}
		
		for(int num:vector1)
			System.out.println(num+" ");
		}
		
		}
	

