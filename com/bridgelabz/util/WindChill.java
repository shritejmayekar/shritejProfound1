/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill t v
 *  
 *  Purpose: To find windchill
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class WindChill {
	/*
	*	main method to calculate windchill
	*/
    public static void main(String[] args) {
	/*
	*	taking command line args t and v
	*/
            int t=Integer.parseInt(args[0]);
            int v=Integer.parseInt(args[1]);
            //calculate windchill
            double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.println("WindChill:"+w);	
    }
    
}
