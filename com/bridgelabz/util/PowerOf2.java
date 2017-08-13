/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.util.PowerOf2 n
 *  
 *  Purpose: To print table of 2 upto 2^n .
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class PowerOf2 {
	/*
    * The main function is written to get 2 table
    */
    public static void main(String[] args) {
        //Take range upto table will be printed and store in n
            int n=Integer.parseInt(args[0]);
			//print table of 2 upto 2^n
            for(int i=0;i<=n;i++)
            {
                System.out.println("2^"+i+"   "+Math.pow(2, i));
            }
            
    }
    
}
