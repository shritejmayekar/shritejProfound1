/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/BinaryLogic2.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinaryLogic2
 *  
 *  Purpose: To find Binary of decimal number
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

public class BinaryLogic2 {
	/*
	 * Declare variables
	 */
	public static int Number,i;
	public static String binary="";
	public static char[] decToBinaryChar=new char[26];
	public static char[] revDecToBinaryChar=new char[26];
	public static void main(String[] args) {
	/*
	 * Take decimal value as input
	 */
		Number=Integer.parseInt(args[0]);
		while(Number>0)
		{	
			//if remainder is zero than 0
			if(Number%2==0)
				binary+=0;
				//System.out.print(0);
			//if remainder is one than 1
			if(Number%2==1)
				binary+=1;
				//System.out.print(1);
			//Taking quotient of Number
			Number/=2;
		}
		//converting string toCharArray for getting binary number
		decToBinaryChar=binary.toCharArray();
		
		for (int i = 0; i < binary.length(); i++) {
	/*
	*using reversse string logic to get binary number in proper order 
	*/
			revDecToBinaryChar[i]=decToBinaryChar[binary.length()-i-1];
		}
	
		System.out.println(revDecToBinaryChar);

	}

}
