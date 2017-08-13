/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DoubleOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.DoubleOpt
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


public class DoubleOpt {
    /*
    * The main function is written to get DoubleOpt
    */
    public static void main(String[] args) {
    /*
    * Scanner class is used to take an input from user
    */     
		Scanner input=new Scanner(System.in);
    /*
    * a variable stores the number entered by the user as the input
    */     
        System.out.print("Enter a:");
        double a=input.nextDouble();
	/*
    * b variable stores the number entered by the user as the input
    */ 
        System.out.print("\nEnter b:");
        double b=input.nextDouble();
	/*
    * c variable stores the number entered by the user as the input
    */ 
        System.out.print("\nEnter c:");
        double c=input.nextDouble();
	/*
    * Double Opeartions
    */ 
        System.out.println("=========Double Opeartions=========");
	/*
    * Perform operation a+b*c and store in Operation1
    */ 
        double Operation1=a+b*c;
        System.out.println("a+b*c="+Operation1);
	/*
    * Perform operation a*b+c and store in Opeartion2
    */
        double Operation2=a*b+c;
        System.out.println("a*b+c="+Operation2);
	/*
    * Perform operation c+a/b and store in Opeartion3
    */
        double Operation3=c+a/b;
        System.out.println("c+a/b="+Operation3);
	/*
    * Perform operation a%b+c and store in Opeartion3
    */
        double Operation4=a%b+c;
        System.out.println("a%b+c="+Operation4);
    }
    
    
    
}
