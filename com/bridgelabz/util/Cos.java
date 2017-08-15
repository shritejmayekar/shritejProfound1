/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Cos.java
 *  Execution:    java -cp bin com.bridgelabz.util.Cos
 *  
 *  Purpose: To find cosine using Taylor series
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 import java.util.Scanner;
 
public class Cos {
	//variable declaration
    static double fact=1,sum=0,number=8,i=1;
    static double counter=2,angleDegree,sumSinx;
    static double angleRadian;
	//method to find factorial
    public static double factorial(double number)
    {
       while(number>0)
       {
           fact=fact*number;
           number=number-1;
       }
       return fact;
    }
	//method to displaySeries
	public static void displaySeries(double angleRadian )
	{
		while(i<number)
		{
			if(i==1)
				System.out.print(1);	
			else
			{
				System.out.print(angleRadian+"^"+i+"/");
				System.out.print(i+"!");
			}
			if(counter++%2==0)
				System.out.print("-");
			else
				System.out.print("+");	
			i=i*2;
		}
	}
    //main method to get cosx 
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the angle:");
        angleDegree=input.nextInt();
       //angle to radian
        angleRadian=angleDegree * (Math.PI/180);
        displaySeries(angleRadian);
        i=1;
        int sign=1;
        while(i<number)
        {
            sum+=Math.pow(angleRadian, i)/factorial(i);
            sign=-sign;
            i=i*2;
        }
        System.out.println("\ncosx="+sum);
        
    }
    
}

