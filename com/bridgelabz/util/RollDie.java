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
	static int n, die,k=0;
	static int max=0,count=0;

	public static void main(String args[])
	{	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Die Roll times:");
		n=in.nextInt();
		int[] arr=new int[20];
		int[] repeated=new int[20];
		for(int i=0;i<n;i++)
		{
			die=(int)(1+Math.random()*6);
			arr[i]=die;
			System.out.println("Die "+die);
			
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				if(count==2)
				{
					repeated[k++]=arr[j];
					
					break;
				}
			}
			count=0;
		}
		for(int i=0;i<k;i++)
		{
			System.out.println("The "+repeated[i]+" is repeated");
		}
		

		
	}
}