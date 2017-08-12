/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.util.TemperatureConversion
 *  
 *  Purpose: To perform TemperatureConversion
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
 package com.bridgelabz.util;
import java.util.Scanner;

public class TemperatureConversion {
    /*
	*cTof function converts celcius to Farenheit
	*/
    public static double cTof(double cel)
    {
        double fahr=(cel*9/5)+32;
        return fahr;
    }
	/*
	*fToc function converts farenheit to celcius
	*/
    public static double  fToc(double fahr)
    {
        double cel=(fahr-32)*5/9;
        return cel;
    }
    /*
	*	main function for converts celcius to farenheit and vice versa
	*/
    public static void main(String[] args) {
     
	/*
	*	scanner class for taking input
	*/
        Scanner input=new Scanner(System.in);
        boolean loop=true;
        while(loop)
        {
            System.out.println("\nPlease Make choice\n1.Celsius to Fahrenheit"
                    + "\n2.Fahrenheit to Celsius\n3.Exit"); 
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the Temperature in Celsius:");
                    double Celsius=input.nextDouble();
                    System.out.println(Celsius+" Celsius in Fahrenheit:"+cTof(Celsius));
                    break;
                case 2:
                    System.out.print("Enter the Temperature in Fahrenheit:");
                    double Fahr=input.nextDouble();
                    System.out.println(Fahr+"  Fahrenheit in Celsius:"+fToc(Fahr));
                    break;
                case 3:
                    loop=false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
    
}
