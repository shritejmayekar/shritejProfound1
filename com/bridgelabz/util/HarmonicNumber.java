/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber n
 *  
 *  Purpose: To find HarmonicNumber upto n
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class HarmonicNumber {
    /*Creating an method name Harmonic */
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
           //Taking an nth element
           int n=Integer.parseInt(args[0]);
           System.out.println("\nThe sum of Harmonic:"+Harmonic(n));
    }
    
}

