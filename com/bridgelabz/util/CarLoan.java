/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
 *  Execution:    java -cp bin com.bridgelabz.util.CarLoan p y r
 *  
 *  Purpose: To Determine the Monthly Payement of p(principal amt),y(year) and r(RateOfInterest).
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 
package com.bridgelabz.util;

public class CarLoan {
	/*
	*	To store valuesof principal,year and rate.
	*/
	static double Principal,Year,Rate;
	/*
	*	To calculate monthly payment
	*/
	static double p,n,r,payment;
	/*
    * The main function is written to get monthly payment class
    */
    public static void main(String[] args) {
           
	/*
    * Principal variable stores the number entered by the user as the input
    */		   
		Principal=Double.parseDouble(args[0]);
	/*
    * Year variable stores the number entered by the user as the input
    */
		Year=Double.parseDouble(args[1]);
	/*
    * Rate variable stores the number entered by the user as the input
    */
		Rate=Double.parseDouble(args[2]);
		
    //Assigning Values of principal,year and rate to p,n and r for calculation
         n=12*Year;
		r=Rate/(12*100);
	//payement stores an montly payement amount
		payment=(Principal*r)/(1-Math.pow(1+r, -n));
    //printing montly payement    
        System.out.println("The monthly payment:"+payment);
        
    }
    
}
