/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfTwoDice
 *  
 *  Purpose: To perform SumOfTwoDice
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;

public class SumOfTwoDice {
	/*
	*	main function to get sum of two dice
	*/
    public static void main(String[] args) {
		//initialize dice
          double dice1=0.0;
          double dice2=0.0;
          int sum=0;
            for(int i=0;i<6;i++)
            {
                 dice1=1+Math.random()*6;
                 dice2=1+Math.random()*6;
                
            }
            sum=(int) (dice1+dice2);
            System.out.println("Dice1: "+dice1+"\tDice2: "+dice2);
            System.out.println("sum="+sum);
    }
    
}
