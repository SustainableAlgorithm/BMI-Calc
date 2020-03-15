/*
This program calculates and displays body mass index (BMI)
It displays normal BMI range and makes recommendations for low and high values
*/

import java.util.Scanner;

public class BMICalc
{
   public static void main(String[] args)
   {
      final double INPERFOOT = 12.00;
      final double LBPERKG = 2.20;
      final double INPERMETER = 39.37;
      final double BMINORMLOW = 18.5;
      final double BMINORMHIGH = 25.0;
      
      double BMI;
      double heightIn, heightM;
      double weightLb, weightKg;
      
      Scanner scIn = new Scanner(System.in);
      
      System.out.print("Enger weight in lbs.: ");
      weightLb = scIn.nextDouble();
      weightKg = weightLb/LBPERKG;
      
      System.out.print("Enter your height in inches: ");
      heightIn = scIn.nextDouble();
      heightM = heightIn/INPERMETER;
      
      BMI = weightKg/(heightM*heightM);
      
      System.out.println(); System.out.println();
      
      System.out.printf("Your BMI is: %.1f kg/m^2\n", BMI);
      
      System.out.printf("The normal range is: %.1f to %.1f\n", BMINORMLOW, BMINORMHIGH);
      
      System.out.println(); System.out.println();
      
      if (BMI < BMINORMLOW)
      {
         System.out.printf("Your BMI of %.1f is below %.1f. Please consult your phsician " +
         " or nutritionist.\n", BMI, BMINORMLOW);
      }
      else if (BMI > BMINORMHIGH)
      {
         System.out.printf("Your BMI of %.1f is above %.1f. Please consult your physician.\n", 
         BMI, BMINORMHIGH);
      }
      else  // within normal range
      {
         System.out.printf("Your BMI of %.1f is within normal range. " +
         "Periodically review your diet and exercise regimen.\n", BMI);
      }
   }
}      