package assignment2;

import java.util.Scanner;

/**
 * Driver class to run the assignment2.HeartRates class for calculating the heart rates.
 *
 * @author Malathi Priyanka Tatikonda
 */
public class HeartRatesTest {
  /**
   * Main method to start the program.
   */
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Heart Rates Calculator");
    System.out.println("----------------------");

    // user input section.
    System.out.println("Enter First Name");
    String firstName = input.nextLine();

    System.out.println("Enter Last Name");
    String lastName = input.nextLine();

    System.out.println("Enter Birth Year");
    int birthYear = input.nextInt();

    System.out.println("Enter Current Year");
    int currentYear = input.nextInt();

    // Instance creation for assignment2.HeartRates class.
    HeartRates person = new HeartRates( firstName, lastName, birthYear, currentYear);

    System.out.println("\n\n----------------- Output----------------");
    System.out.println("First Name: " + person.getFirstName());
    System.out.println("Last Name: " + person.getLastName());
    System.out.println("Birth Year: " + person.getBirthYear());
    System.out.println("Current Year: " + person.getCurrentYear());
    System.out.println("Age: " + person.getAge()+ " Years");
    System.out.println("Maximum Heart Rate: "  + person.getMaximumHeartRate() + " BPM");
    System.out.println("Minimum Target Heart Rate: " + person.getMinimumTargetHearRate()+ " BPM");
    System.out.println("Maximum Target Heart Rate: " + person.getMaximumTargetHearRate()+ " BPM");
  }
}
