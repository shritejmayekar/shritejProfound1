/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic
 *  
 *  Purpose: To get the roots of Quadratic equation
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

public class Quadratic {
	/*
	*	main function to get Quadratic equation roots
	*/
    public static void main(String[] args) {
	/*
	*	Scanner class used to get input from user
	*/
            Scanner input=new Scanner(System.in);
    /*
	*	variable a used for storing value of user
	*/
            System.out.println("Enter value for a:");
            double a=input.nextDouble();
    /*
	*	variable b used for storing value of user
	*/       
            System.out.println("Enter value for b:");
            double b=input.nextDouble();
     /*
	*	variable c used for storing value of user
	*/       
            System.out.println("Enter value for c:");
            double c=input.nextDouble();
            
            double delta=Math.pow(b, 2)-4*a*c;
            //delta equal zero implies  roots are real and equal
            if(delta==0)
            {
                System.out.println("Roots are real and equal");
                double Realroot=-b/(2*a);
                System.err.println("Root:"+Realroot);
            }
			//implies roots are real and distinct
            else if(delta>0)
            {
                System.out.println("Roots are real and distinct");
                double root1=(-b+Math.sqrt(delta))/(2*a);
                double root2=(-b-Math.sqrt(delta))/(2*a);
                System.out.println("Root1="+root1+ "  Root2="+root2);

            }
			//implies roots are imaginary
            else
                System.out.println("Roots are imaginary");
                
            
            
    }
    
}
