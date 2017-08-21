/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames
 *  
 *  Purpose: To print Names and descending order
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

public class PrintThreeNames {
//Declare variables
	public static int length=args.length;
	public static String inputName="";
	public static String reverseName="";
/*
 *	The main function is written to print Names in descending order
*/
    public static void main(String[] args) {
/*
*	Take an input using command line argument
*/      
    
	for(int i=0;i<length;i++)
	{
		inputName=inputName+args[i]+" ";
	}
	
/*
*	Printing three names
*/
	System.out.print("Hi ");
	for(int i=length-1;i>=0;i--)
	{
		reverseName=reverseName+args[i]+", ";
	}
	System.out.print(reverseName);
        
        
                
    }
    
}
