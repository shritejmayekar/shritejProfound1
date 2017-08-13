/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SecondLargest.java
 *  Execution:    java -cp bin com.bridgelabz.util.SecondLargest
 *  
 *  Purpose: To find second largest and second smallest
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

class SecondLargest
{
	/*
	*	To store max , second_max and range n
	*/
	static int max=0,secondMax,n;
	/*
	*	To store min and secondMin
	*/
	static int min=1,secondMin;
	/*
	*	main method to calculate secondlargest and second smallest
	*/
	public static void main(String args[])
	{	
	/*
	*	scanner class to get input 
	*/
		Scanner in=new Scanner(System.in);
		//enter the range
		System.out.println("Enter n:");
		n=in.nextInt();
		// initialize array of size n
		int[] array=new int[n];
		
		System.out.println("Enter numbers:");
		for(int i=0;i<n;i++)
		{		//Taking array element form user
				array[i]=in.nextInt();
				//storing second max value as max
				secondMax=max;
				
				//finding max of element
				max=Math.max(max,array[i]);
				if((secondMax<max))
				{
					secondMax=Math.min(secondMax,array[i]);
				}
			
				//calculate second_max by taking min of max and second_max
				//secondmax=math.min(max,secondmax);
				//secondmin=min;
				//min=math.min(min,array[i]);
				//calculate second_min by taking min of min and second_min
				//secondmax=math.min(min,secondmin);
				
				
		}
		
			 
		for(int i=0;i<n;i++)
		{
		
		}
		
		System.out.println("max="+max);
		System.out.println("second_max="+secondMax);
		//System.out.println("min="+min);
		//System.out.println("second_min="+secondMin);
		
	}
}