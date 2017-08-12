/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Trig.java
 *  Execution:    java -cp bin com.bridgelabz.util.Trig
 *  
 *  Purpose: To perform Trignometric operation
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;
public class Trig {
	/*
	*	main function to perform trignometric operation
	*/
    public static void main(String[] args) {
    /*
	*	Scanner class used for get input
	*/
        Scanner input=new Scanner(System.in);
		//enter angle in degree
        System.out.print("Please enter the angle:");
        double degree=input.nextInt();
       //convert to radian 
      double  radian=Math.toRadians(degree);
	  //find sine
      double sine=Math.sin(radian);
	  //find cosine
      double cosine=Math.cos(radian);
      
        System.out.println("Angle in radians:"+radian);
        System.out.println("Sine :"+sine);
        System.out.println("Cosine :"+cosine);
    }
    
}
