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
    /*
    * The main function is written to print Names and descending order
    */
    public static void main(String[] args) {
     /*
    * Scanner class to get input of three names
    */  
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three  Names:");
        String Name1=input.next();
        String Name2=input.next();
        String Name3=input.next();
	/*
    * Printing three names
    */
        System.out.println("==========");
        System.out.println("Hi "+Name3+","+Name2+" and "+Name1);
        
        
                
    }
    
}
