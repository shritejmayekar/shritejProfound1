/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Stats5.java
 *  Execution:    java -cp bin com.bridgelabz.util.Stats5
 *  
 *  Purpose: To take average,max and min of Random value
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class Stats5 {
	/*
	*	main function to get average,max and min of Random value
	*/
	
    public static void main(String[] args) {
		//initialize value
       double sum=0,avg,r=0; 
	   double max=0.5,min=0.5;
       for(int i=0;i<5;i++)
       {
		   //generate random value 0.0 to 1.0
            double RandomValue=Math.random();
			//get max of two num
			max=Math.max(RandomValue,max);
			//get min of two num
			min=Math.min(RandomValue,min);
			
           System.out.println(RandomValue);
           sum=sum+RandomValue;
			
           
       }
        System.out.println("Average="+(sum/5));
		 System.out.println("Max="+max);
		System.out.println("Min="+min);
        
    }
}
