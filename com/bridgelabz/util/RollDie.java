/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RollDie.java
 *  Execution:    java -cp bin com.bridgelabz.util.RollDie
 *  
 *  Purpose: To find max of roll die
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

class RollDie
{
	int n, die;
	int max=0;
	public static void main(String args[])
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Die Roll times:");
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			die=(int)(1+Math.random()*6);
			System.out.println("The "+die);
			max=Math.max(max,die);
		}
		
		System.out.println(max);
		
	}
}