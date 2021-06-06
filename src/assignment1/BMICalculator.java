package assignment1;

import java.util.Scanner;

/**
 * The class to perform BMI calculation.
 *
 * @author Malathi Priyanka Tatikonda
 */
public class BMICalculator {
  /**
   * Main method to start the BMI calculation process.
   */
  public static void main (String[] args){
    System.out.println("BMI CALCULATOR");

    // Steps to read the input values from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter weight in pounds: ");
    float weight = input.nextFloat();
    System.out.print("Enter height in inches: ");
    float height = input.nextFloat();

    // BMI calculation.
    float bmi = (weight * 703)/(height * height);
    System.out.printf("BMI is %f%n", bmi);

    System.out.println("------------------------");

    // BMI Categories display.
    System.out.println("BMI CATEGORIES");
    System.out.println("Under Weight  = < 18.5");
    System.out.println("Normal Weight = 18.5 - 24.9");
    System.out.println("Over Weight   = 25 - 29.9");
    System.out.println("Obesity       = BMI of 30 or greater");
  }
}
