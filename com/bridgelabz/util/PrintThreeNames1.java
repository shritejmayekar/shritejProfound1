/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/PrintThreeNames1.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrintThreeNames1
 *  
 *  Purpose: To print names in reverse order
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
public class PrintThreeNames1 {
    
    public static void main(String[] args) {
		//Get names from commandline arguments and print in reverse
        
        System.out.println("Hi "+args[2]+" ,"+args[1]+" and "+args[0]);
        
                
    }
    
}