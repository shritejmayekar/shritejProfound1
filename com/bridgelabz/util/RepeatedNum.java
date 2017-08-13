/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/RepeatedNum.java
 *  Execution:    java -cp bin com.bridgelabz.util.RepeatedNum
 *  
 *  Purpose: To check RepeatedNum numbers
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;


class RepeatedNum
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0,n;
		int[] arr=new int[100];
		int[] repeated=new int[50];
		int k=0;
		System.out.println("Enter the 1 to n:");
		n=in.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
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