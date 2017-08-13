/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
 *  Execution:    java -cp bin com.bridgelabz.util.IntOpt
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


public class IntOpt {
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
        int a=input.nextInt();
	/*
    * b variable stores the number entered by the user as the input
    */
        System.out.print("\nEnter b:");
        int b=input.nextInt();
	/*
    * c variable stores the number entered by the user as the input
    */
        System.out.print("\nEnter c:");
        int c=input.nextInt();
	/*
    * Integer Opeartions
    */ 
        System.out.println("=========Integer Opeartions=========");
	/*
    * Perform operation a+b*c and store in Operation1
    */ 
        int Operation1=a+b*c;
        System.out.println("a+b*c="+Operation1);
	/*
    * Perform operation a*b+c and store in Opeartion2
    */
        int Operation2=a*b+c;
        System.out.println("a*b+c="+Operation2);
	/*
    * Perform operation c+a/b and store in Opeartion3
    */
        int Operation3=c+a/b;
        System.out.println("c+a/b="+Operation3);
	/*
    * Perform operation a%b+c and store in Opeartion3
    */
        int Operation4=a%b+c;
        System.out.println("a%b+c="+Operation4);
    }
    
}
