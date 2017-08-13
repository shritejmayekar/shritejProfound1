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
class prime {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter the range");
		int n=in.nextInt();
		int count=0,k=0;
	
		
		for(int i=1;i<=n;i++)
		{
			count=0;
			if(i==1)
			System.out.println(i);
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
				{
					System.out.println(i);
				}
		}
		
		
	}
}
				
				
