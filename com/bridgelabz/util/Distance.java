/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.Distance x y
 *  
 *  Purpose: To find an Euclidean distance from origin (0,0) to (x,y)
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 
package com.bridgelabz.util;

public class Distance {
	static int x,y,distance;
	/*
    * The main function is written to get Euclidean distance
    */
    public static void main(String[] args) {
    /*
    * x variable stores the number entered by the user as the input
    */  
		 x=Integer.parseInt(args[0]);
	/*
    * y variable stores the number entered by the user as the input
    */
       y=Integer.parseInt(args[1]);
	/*
    * distance variable stores the result of x*x and y*y and calculating using Math.pow function
    */	
        distance=(int) Math.pow(x, 2)+(int)Math.pow(y, 2);
	/*
    * Taking Distance squareroot to find euclidean distance using Math.sqrt function
    */
        distance=(int) Math.sqrt(distance);
     /*
    * Printing Euclidean distance
    */ 
        System.out.println("The Euclidean distanec from origin:"+distance);
        
        
        
    }
    
}
