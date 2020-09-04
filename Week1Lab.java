/*
 *Copyright 2020, Oracle America, Inc. All rights reserved. Use is subject to license terms. ORACLE and JAVA trademarks and all ORACLE- and JAVA-related trademarks, service marks, logos and other brand designations are trademarks or registered trademarks of Oracle in the U.S. and other countries.”

/**************************************************** 
Program Name: Week1Lab.java 
Programmer's Name: Richardson Gage Milton
Program Description: This program will take input from user of their age, name, weight, height and then use that data to calculate their bmi 
***********************************************************/


package week.pkg1.lab;
// imports
import java.text.DecimalFormat;
import java.util.Scanner;


public class Week1Lab {

  // main
    public static void main(String[] args) {
        // make a scanner to get input
        Scanner scan = new Scanner(System.in);
        
        // loop until user gives us an X
        String name = ""; 
        
        //while ( name.equalsIgnoreCase ("X") == false ) 
        while ( true )
        { // output asking for name or to quit
            System.out.print("Enter name or X to quit: ");
            name = scan.nextLine();
            
            if ( !name.equalsIgnoreCase("X") )
            {
              // get more info
              System.out.print ("Enter age: ");
              int age = scan.nextInt();
              System.out.print("Enter Weight: ");
              double weight = scan.nextDouble();
              System.out.print("Enter Height - Feet: ");
              int feet = scan.nextInt(); 
              System.out.print("Enter height - inches: ");
              double inches = scan.nextDouble(); 
              scan.nextLine(); // use up the Enter key
              
                
                // show health profile
                HealthProfile hp = new HealthProfile(name, age, weight, feet, inches);
                System.out.println( "\nHealth Profile for " + hp.getName() ); // \n new line 
                double bmi = hp.calculateBMI();
                DecimalFormat fmt = new DecimalFormat("0.0");
                System.out.println( "BMI:  " + fmt.format(bmi) );
                System.out.println( "BMI Category: " + hp.calculateCategory() );
                System.out.println( "Max heart rate: " + hp.calculateMaxHR() );
                System.out.println(); 
                
                
                
            }
            else
            {
                break; // break out of the while loop.
            }
        }
    }
    
}
