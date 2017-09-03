/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/StringFunctions.java
 *  Execution:    java -cp bin com.bridgelabz.util.StringFunctions
 *  
 *  Purpose: To Perfom the various operation on the String
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

/**
*	Main Class to perform string functions
*/
public class StringFunctions {
	
/**
*	Variables Declaration for storing input and to perform operation
*/
    public static char[] name;
    public static char[] dummyname;
    public static String inputName,inputNameFisrt,inputNameSecond;
    public static int count=0,choice=1;
/**
*	Static Variable is declared to Print message if the name is anagram or not
*/
    public static String ANAGRAM_MESSAGE="The name is anagram";
    public static String NOT_ANAGRAM_MESSAGE="The name is not anagram";

/**
*	Static Variable is declared to Print message if the name is pallindrome or not
*/
    public static String PALLINDROME_MESSAGE=" is Pallindrome";
    public static String NOT_PALLINDROME_MESSAGE=" is not Pallindrome";
    
/**
*	static method to check string is pallindrome or not
*/
    public static Boolean isPallindrome(String inputname)
	{
		inputname=inputname.toLowerCase();
		name=inputname.toCharArray();
		for(int i=0;i<name.length/2;i++)
		{
			//if first and last is equal increment count than second first and so on
			if(name[i]==name[name.length-i-1])
			{
				count++;
			}
		}
		if(count==name.length/2)
			return true;
		return false;
	}
    
/**
*	static method to check two string  are anagram or not
*/    
    public static Boolean isAnagram(String name1,String name2 ) 
    {
		
        name=name1.toCharArray();
        dummyname=name2.toCharArray();
        if(name1.length()==name2.length())
        {
            for(int i=0;i<name.length;i++)
            {
                for(int j=0;j<name.length;j++)
                {
                  if(name[i]==dummyname[j])  
                  {
		dummyname[j]='$';
		count++;
		break;
                  }
                }
               
            }
            if(count==name.length)
                return true;
        }
		return false;  
    }
/**
*	static method to check two string  are anagram or not
*/
	public static boolean isAnagram2(String name1,String name2)
	{
		name=name1.toCharArray();
		dummyname=name2.toCharArray();
		name=sortChar(name);
		dummyname=sortChar(dummyname);
		String string1=new String(name);
		String string2=new String(dummyname);
		if(string1.equals(string2))
			return true;
		return false;
	}
	
/**
*	Sort char
*/
	public static char[] sortChar(char[] name)
	{
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name.length;j++)
			{
				if(name[i]<name[j])
				{
					char temp=name[j];
					name[j]=name[i];
					name[i]=temp;
				}
			}
		}
		// for(int i=0;i<name.length;i++)
			// System.out.println(name[i]);
		return name;
	}
	public static void recuString(String name)
	{
		dummyname=name.toCharArray();
		char name2[];
		for(int i=0;i<dummyname.length;i++)
		{
			char c=dummyname[0];
			dummyname[0]=dummyname[i];
			dummyname[i]=c;
			
			name2=dummyname;
			int k=1;
			//System.out.println(name2);
			for(int j=0;j<dummyname.length-1;j++)
			 {
				 System.out.println(name2);
				 char temp;
			temp=name2[name2.length-1];
			 name2[name2.length-1]=name2[j];
			 name2[j]=temp;
			 
			//System.out.println(name2);
			// if(k<3)
			// {
			// char temp;
			// temp=name2[k];
			// name2[k]=name2[k+1];
			// name2[k]=temp;
			// //System.out.println(name2);
			// k++;
			// }
			
			}
			
		}
	}
	
/**
*	main method to perform string functions
*/
    public static void main(String[] args) {
/**
*	scanner class for taking input
*/       
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter the choice\n"
               + " 1.Anagram \n 2.Pallindrome \n 3.Recur");
    choice=input.nextInt();	//Take choice of above Menu
        switch(choice)
        {
           case 1:
            System.out.println("Please enter the Name:");
            inputNameFisrt=input.next();
            System.out.println("Please enter the Name 2:");
            inputNameSecond=input.next();
/**
*	static method call if returns true than anagram else not
*/
            if(isAnagram(inputNameFisrt, inputNameSecond))
                System.out.println(ANAGRAM_MESSAGE);
            else
                System.out.println(NOT_ANAGRAM_MESSAGE);
            
            break;
           case 2:
            System.out.println("Please enter the Name:");
            inputName=input.next();
/*
*	static method call if returns true than Pallindrome else not
*/
            if(isPallindrome(inputName))
                System.out.println("The "+inputName+PALLINDROME_MESSAGE);
            else
                System.out.println("The "+inputName+NOT_PALLINDROME_MESSAGE);
                break;
			case 3:
			System.out.print("Please enter the Name:");
            inputName=input.next();
			recuString(inputName);
			
			break;
           
           default:
               System.out.print("Inavalid");
               break;
            
         }
        
           
        }
        
    }
    

