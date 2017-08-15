/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrimeFactor.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeFactor
 *  
 *  Purpose: To find PrimeFactor of number
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 import java.util.Scanner;
 
public class PrimeFactor {
	//Variable Declaration
	static int Number,factor;
	/*
	*	main method to find prime factors
	*/
    public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
	/*
	*	Take number to find factor
	*/
		System.out.print("Enter no. to find factor:");
		Number=in.nextInt();
		int temp=Number;
		// for(factor=2;factor*factor<=Number;factor++)
		// {
			// //if factor divides number than it is factor
			// if(Number%factor==0)
			// {
				
				// //prints factor and quoitient
				// System.out.println(factor+" "+Number/factor);
				
			
			// }
			
			
		// }
			int i=3;
		while(i*i<=Number)
		{
			int j=2;
			
			if(temp%i==0)
				System.out.println(i+ " ");
			i=i++;
		}
    }    
}
