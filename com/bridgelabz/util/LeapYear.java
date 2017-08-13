/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.LeapYear
 *  
 *  Purpose: To check whether the entered is leap year or not.
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

public class LeapYear {
	/**
    * Function to check for isLeapYear
    *
    * @param year the year to check for isLeapYear
    */
    public static boolean isLeapYear(int year)
    {
		//if condition satisfies than return boolean true
        if(year%400==0)
            return true;
		//if condition satisfies than return boolean false
        else if(year%100==0)
            return false;
		//if condition satisfies than return boolean true
        else if(year%4==0)
                return true;
        
        //else return boolean false    
        return false;
    }
	/*
    * The main function is written to check for LeapYear
    */
    public static void main(String[] args) {
	/*
    * Scanner class to get input of year
    */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Year:");
        int Year=input.nextInt();
		//if year is greater than 1582 than we can check leap yaer
        if(Year>=1582)
        {
			//checking for leap year if function returns true than satisfies condition
            if(isLeapYear(Year))
                System.out.println("The "+Year+"  is an Leap Year");
			//returns false from function than not an leap year
            else
                System.out.println("The "+Year+" is not an Leap Year");
        }
        else
			//year not acccording to Gregorian calender
            System.out.println("Year is not acccording to Gregorian Calender");
        
        
    }
    
}
