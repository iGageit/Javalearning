CIS355A Week 1 Lab—Developing an OOP Console Application

OBJECTIVES
•	Create a class in java with appropriate methods.
•	Process user input with the class using the scanner for keyboard input and console output.

PROBLEM:  Health Profile Console Program
GymsRUs has a need to provide fitness/health information to their clients, including BMI and maximum heart rate. Your task is to write a console program to do this.

Body mass index (BMI) is a measure of body fat based on a person’s height and weight. BMI can be used to indicate if you are overweight, obese, underweight, or normal. The formula to calculate BMI is BMI = (weight(lb) * 703) / ((height(in))^2)
 

The following BMI categories are based on this calculation.
Category	BMI Range
Underweight	less than 18.5
Normal	between 18.5 and 24.9
Overweight	between 25 and 29.9
Obese	30 or more

Max heart rate is calculated as 220 minus a person’s age.

FUNCTIONAL REQUIREMENTS
Design and code a class called HealthProfile to store information about clients and their fitness data. The attributes (name, age, weight, and height) are private instance variables. The class must include the following methods.

method	description
setName	Receives a value to assign to private instance variable
setAge	Receives a value to assign to private instance variable
setWeight	Receives a value to assign to private instance variable
setHeight	Receives TWO inputs (height in feet, inches).  Converts and stores the total INCHES in private instance variable
getName	Returns private instance variable
getAge	Returns private instance variable
getWeight	Returns private instance variable
getHeight	Returns private instance variable (inches)
getBMI	Calculates and returns BMI
getCategory	Returns category based on BMI
getMaxHR	Calculates and returns maximum heart rate

Create a SEPARATE TEST CLASS, Lab1Main, to prompt for user input and display output using the HealthProfile class. Process multiple inputs using a loop. You can assume all user input is valid.

SAMPLE OUTPUT

Enter name or X to quit: John Smith
Your age: 35
Your weight: 200
Your height - feet: 6
Your height - inches: 0

Health Profile for John Smith
BMI:  27.1
BMI Category: overweight
Max heart rate: 185

Enter name or X to quit: Ann Jones
Your age: 50
Your weight: 120
Your height - feet: 5
Your height - inches: 2

Health Profile for Ann Jones
BMI:  21.9
BMI Category: normal
Max heart rate: 170

Enter name or X to quit: X



 
GRADING RUBRIC
HealthProfile class
•	All methods created with proper functionality	25
Lab1Main class
•	Receives user input using Scanner
•	Process input using a HealthProfile object
•	Correct output displayed in console
•	BMI displayed with 1 decimal place
•	Loop to process multiple clients	10
Code style	5
Lab Report	5
TOTAL	45

CODE STYLE REQUIREMENTS
•	Include meaningful comments throughout your code.
•	Use meaningful names for variables.
•	Code must be properly indented.
•	Include a comment header at beginning of each file, example below.
/**************************************************** 
Program Name: ProgramName.java 
Programmer's Name: Student Name 
Program Description: Describe here what this program will do 
***********************************************************/

DELIVERABLES
Submit as a SINGLE zip folder
•	All java files
•	Lab report

Follow assignment specification regarding class/method names.
Note that your java filename must match class name (DO NOT rename).

