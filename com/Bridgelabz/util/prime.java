/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/prime.java
 *  Execution:    java -cp bin com.bridgelabz.util.prime
 *  
 *  Purpose: To perform different arithmetic operation on variable a,b and c.
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;
public class prime {
	//Declaring variable
	static int range,count,k;
	
	/*
	*	method printPrime to get range of values prime and print the same
	*/
	public static void printPrime(int range)
	{
		for(int i=1;i<=range;i++)
		{
			//Initializing variable count
			count=0;
			if(i==1)
			System.out.println(i);
			for(int j=1;j<=range;j++)
			{
				if(i%j==0)
					count++;	
			}
			if(count==2)
				System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		//Taking range of numbers;
		System.out.print("Enter the range:");
		range=in.nextInt();
		//calling method printPrime
		printPrime(range);
	}
}
				
				
