/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek month day year
 *  
 *  Purpose: To find DayOfWeek
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
 
public class DayOfWeek {
	//for storing m,y,d
	static int month,year,day;
	//y0,x,m0,d0 for further calculation
	static int y0,m0,d0,x;
	/*
	*	main function to calculate day of week
	*/
    public static void main(String[] args) {
		//get month
         month=Integer.parseInt(args[0]);
		//get day
        day=Integer.parseInt(args[1]);
		//get year
         year=Integer.parseInt(args[2]);
       //calculate according to georgian calender
       y0=year-(14-month)/12;
       x=y0+y0/4-y0/100+y0/400;
       m0=month+12*((14-month)/12)-2;
       d0=(day+x+31*m0/12)%7;
       System.out.println("year:"+y0+" month:"+m0+" day:"+d0);
        
        
    }
    
}
