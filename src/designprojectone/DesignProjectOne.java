/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
/***************************************************
*
*  Program: Tech Fair Calculator
*  Author: Alvern Wang
*  Date: March 15 2024
*  Description: Calculates cost per student and total cost for the science fair
****************************************************/

/**************** IPO CHART ************************
*INPUT:
* Number of students doing an Arduino project
* Number of students doing a Raspberry Pi project
* Number of students doing a VR project
*PROCESSING:
* Add number of students for other projects to find the total of students to find out if there is a discount
* 
* Additional discounts for Arduino project if more than 15 students
* 
* Additional discounts for Raspberry Pi project if more than 20 students
* 
* Find total cost for all projects
* 
* Divide total by number of students to find how much each students need to pay
*OUTPUT:
* Total cost for all projects
* 
* How much each student needs to pay
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*1       15,15,15       2925
*2       50,50,50       9175     
*3       10,10,10       1950
*4       16,20,10       2944
*5       15,21,10       2902
*6       -1,-1,-1       Enter a positive input
*7       0,0,0          No students have signed up for the science fair
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS
  //final int COST_OF_VR
  //final int FIXED_PRICE
  
  //VARIABLES
  //int numArduino
  //int numPI
  //int numVR
  //int cArduino
  //int cPI
  //int totalStu
  //double totalCost
  //double costPS

  //CODE
  /*
  PROGRAM TechFairCostCalculator
    READ ARDUINO_STUDENTS
    READ PI_STUDENTS
    READ VR_STUDENTS
    
    VR_COST = 20
    FIXED_PRICE = 50
    TOTAL_STUDENTS = ARDUINO_STUDENTS + PI_STUDENTS + VR_STUDENTS
  
    IF ARDUINO_STUDENTS > 15
        THEN ARDUINO_COST = 9
    ELSE
        ARDUINO_COST = 10
    END IF
  
    IF PI_STUDENTS > 20
        THEN PI_COST = 12
    ELSE
        PI_COST = 15
    END IF
  
    IF TOTAL_STUDENTS > 100
        TOTAL_COST = (ARDUINO_STUDENTS * ARDUINO_COST) + (PI_STUDENTS * PI_COST) + (VR_STUDENTS * VR_COST) + (FIXED_PRICE * 0.95 * TOTAL_STUDENTS 
    ELSE
        TOTAL_COST = (ARDUINO_STUDENTS * ARDUINO_COST) + (PI_STUDENTS * PI_COST) + (VR_STUDENTS * VR_COST) + (TOTAL_STUDENTS * FIXED_PRICE)
    END IF
    
    COST_PER_STUDENT = TOTAL_COST / TOTAL_STUDENTS
    PRINT "Total Cost: " + TOTAL_COST
    PRINT "Cost per Student: " + COST_PER_STUDENT
  END.
  */
        //Set up scanner variable
        Scanner s = new Scanner(System.in);
    
        //Set up constants
        final int COST_OF_VR = 20;
        final int FIXED_COST = 50;
        
        //Set up other variables
        int numArduino;
        int numPI;
        int numVR;
        int cArduino;
        int cPI;
        int totalStu;
        double totalCost;
        double costPS;
        
        //Gets input of how many students are doing each project
        do{
            System.out.println("How much students for arduino: ");
            numArduino = s.nextInt();
            System.out.println("How much students for raspberry pi: ");
            numPI = s.nextInt();
            System.out.println("How much students for VR: ");
            numVR = s.nextInt();
            //Checks to see if there are any negative inputs
            if(numArduino < 0 || numPI < 0 || numVR < 0){
                System.out.println("Please enter a non-negative input");
            }
          //Set up while loop until a non-negative number is provided
        } while ((numArduino < 0 || numPI < 0 || numVR < 0));
    
        //Calculates total number of students
        totalStu = numArduino + numPI + numVR;
    
        //Checks to see that there is at least 1 participant
        if(totalStu != 0){
            //Checks whether there is price decrease for arduino projects
            if(numArduino > 15){
                cArduino = 9;
            }else{
                cArduino = 10;
            }
        
            //Checks whether there is price decrease for PI projects
            if(numPI > 20){
                cPI = 12;
            }else{
                cPI = 15;
            }
        
            //Checks whether there is price discount for the fixed price while calculating the total cost
            if(totalStu > 100){
                totalCost = (numArduino * cArduino) + (numPI * cPI) + (numVR * COST_OF_VR) + (FIXED_COST * 0.95 * totalStu);
            }else{
                totalCost = (numArduino * cArduino) + (numPI * cPI) + (numVR * COST_OF_VR) + (FIXED_COST * totalStu);
            }
        
            //Calculates the cost per student
            costPS = totalCost / totalStu;
            
            //prints out total cost and cost per student
            System.out.println("Total Cost: " + totalCost);
            System.out.println("Cost per student: " + costPS);
            
        }else{//prints that there are no participants 
            System.out.println("No student have signed up for the science fair.");
        }
    }
    
}
