/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sin.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sin
 *  
 *  Purpose: To find sine using Taylor series
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 import java.util.Scanner;
 
public class Sin {
	static double x,n;
	/*
	*	main method to calculate sine talyors series
	*/
    public static void main(String[] args) {
		//take angle in degree
		Scanner in=new Scanner(System.in);
		x=in.nextDouble();
		//convert degree
		x=x%(Math.PI*2);
		
		
		
	
    }
    
}
