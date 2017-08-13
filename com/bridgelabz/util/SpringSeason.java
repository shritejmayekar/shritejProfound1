/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason m d
 *  
 *  Purpose: To check whether SpringSeason or not
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class SpringSeason {
    /*
	*	function to check SpringSeason or not of boolean return type
	*/
	/*
	*@param m and d for day and month check
	*/
    public static boolean isSpringSeason(int m,int d)
    {
        int day,month;
        day=d;
        month=m;
		//to check whether the range is true for month and year
        if(((month>=3)&&((day<=31)&&(day>=20))&&(month<=6)))
        {
			if((day>20)&&(month==6))
			{
				return false;
			}
			
            return true;
        }
        return false;
    }
	/*
	*	main function to get SpringSeason or not
	*/
    public static void main(String[] args) {
            
        int m=Integer.parseInt(args[0]);//take as input month
        int d=Integer.parseInt(args[1]); //take as input day
        //function return true than satisfies condition
        if(isSpringSeason(m, d))
            System.out.println("SpringSeason "+isSpringSeason(m, d));
        else
            System.out.println("SpringSeason "+isSpringSeason(m, d));
        
    }
    
}
