package apcsweek2;

/* 
 * Name: FtoC.java 
 * Author: Dominic Carrano 
 * Started: September 1, 2014
 * 
 * Purpose: To convert temperatures
 * from Fahrenheit to Celsius.
 */

import java.util.Scanner;

public class FtoC 
{    //Start of class FtoC
    public static void main(String[] args)
    {    //Start of method main
        
        Scanner scan = new Scanner(System.in);    //Declare scanner
        
        
        /* 
         * Declare booleans to control whether 
         * the output will be in Fahrenheit or Celsius, 
         * based on user input.
         */
        
        boolean outputFahrenheit = false;
        boolean outputCelsius = false;
        
        
        //Prompt user input with println statments.
        System.out.println("Would you like to convert from C to F? Or from F to C?");
        System.out.println("Type \"C\" if you would like to convert from C to F.");
        System.out.println("Type \"F\" if you would like to convert from F to C.");
        
        
        /*
         * Set a string equal to the first line
         * of input from the scanner.
         */
        
        String str = scan.nextLine();
        
        /*
         * Check if user would like to convert from 
         * F to C or from C to F based on input.
         */

        if (str.equals("C")) 
        {
            outputFahrenheit = true;
        }
        else if (str == "F")
        {
            outputCelsius = true;
        }
        else {
            System.out.println("Error - Invalid input.");
        }
        
        /* 
         * Used to check to make sure the 
         * input is being properly taken
         * during the debugging process. 
         */

        System.out.println(outputFahrenheit);
        System.out.println(outputCelsius);
        System.out.println(str);
        
        
    } //End of method main

    /* 
     * Converts Fahrenheit to Celsius, for later use
     * 
     * public static int convert (int in) 
     * {  //Start of method convert      
     *    int out = (in - 32) * 5/9;
     *    return out;
     * }  //End of method convert
     *
     */

} //End of class FtoC
