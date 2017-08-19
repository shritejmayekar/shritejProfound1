/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/MathFunction.java
 *  Execution:    java -cp bin com.bridgelabz.util.MathFunction
 *  
 *  Purpose: To Perform various operation like collinear check, square root ,
 *           harmonic,compound amount ,prime no.,factorial, minMax ,sine,cosine,
 *           and Binary.
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;

 class Compound
{
    public static double isCal(double c,double r,double  t)
    {
        
        return c*Math.pow(1+r,t);
    }
    
}
 public class MathFunction {
    public static double compound,rate,time,C;
    public static double slopeAB,slopeBC,slopeAC;
    public static int x1,y1,x2,y2,x3,y3,choice,number;
    public static long fact=1;
/*	Method returns to checkCollinearUsingSlope
* 	@param (x1,y1),(x2,y2) and (x3,y3) as input to check collinear
*	@return true if collinear else returns false
*/
    public static Boolean checkCollinearUsingSlope(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        slopeAB=(y2-y1)/(x2-x1); //Slope of A and B
        
        slopeBC=(y3-y2)/(x3-x2); //slope of B and C
        
        slopeAC=(y3-y1)/(x3-x1); //slope of A and C
        if((slopeAB==slopeBC)&&(slopeAB==slopeAC)&&(slopeBC==slopeAC))
            return true;
     
        
        return false;
    }
/*	Method returns to checkCollinearUsingArea
* 	@param (x1,y1),(x2,y2) and (x3,y3) as input to check collinear
*	@return true if collinear else returns false
*/
    public static Boolean checkCollinearUsingArea(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        int area;
        
        area=Math.abs(1/2*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2)));
        if(area==0)
            return true;
     
        
        return false;
    }
/*	Method returns to find squareroot using Newtons method
* 	@param c as velocity input
*	@return t as an squareroot
*/
    public static double sqrt(double c)
    {
        double epsilon=1e-15;
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
/*	
*	Method overloaded returns to find squareroot using Newtons method
* 	@param c as velocity input
*	@return t as an squareroot
*/
     public static double sqrt(double c,double epsilon)
    {
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
/*	
*	factorial method to find factorial of number n
*	@param n as number
*	@return fact as factorial
*/
     public static long factorial(int n)
     {
         while(n>0)
         {
             fact=fact*n;
             n--;
         }
         return (fact);
     }
/*	
*	Harmonic method to find Harmonic of number n
*	@param n as number
*	@return sum as harmonic number
*/
     public static double Harmonic(int n)
    {
        double sum=0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("1/"+i);
            if(i<n)
        	System.out.print("+");
			
            sum=sum+Math.pow(i, -1);
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
		System.out.println("\nPlease enter choice\n1.To find Compound rate\n2.Collinear using slope"+
			"\n3.Collinear using area\n4.Find squareroot\n5.Factorial");
		choice=in.nextInt();
        switch(choice)
		{
/*
*	Find compound interest rate
*/
			case 1:
			System.out.println("please enter the c t and r");
			C=in.nextDouble();
			time=in.nextDouble();
			rate=in.nextDouble();
			System.out.println("Compound="+Compound.isCal(C, rate, time));
			break;
			
			case 2:       
/*
*   Check the collinear using slope
*/
			x1=2;y1=4;x2=4;y2=6;x3=6;y3=8;
			if(checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3))
				System.out.println("Collinear");
			else
				System.out.println("Not an collinear");
			break;
			
			case 3:
/*
*   Check the collinear using Area
*/        
			if(checkCollinearUsingArea(x1, y1, x2, y2, x3, y3))
				System.out.println("Collinear");
			else
				System.out.println("Not an collinear");
			break;
			
			case 4:
/*
*   Find squareroot of number c using Newtons's method
*/        
			System.out.println("Please enter an C:");
			C=in.nextDouble();
			System.out.println("sqrt="+sqrt(C));
			System.out.println("sqrt="+sqrt(C,1e-15));
			break;
			
			case 5:
/*
*   Find factorial of number
*/      	System.out.print("Enter the number:");
			number=in.nextInt();
			System.out.println("fact="+factorial(number));
			break;
			
			default:
			System.out.print("Invalid choice");
			break;
		}
    }
    
}
