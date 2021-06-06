package assignment2;

import java.util.Scanner;

/**
 * Class to calculate the world population growth for the next 75years.
 *
 * @author Matalhi Priyanka Tatikonda
 */
public class WorldPopulationGrowth {
  /**
   * Main method to start the program.
   */
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the World Population Calculator");
    System.out.println("----------------------------------------------------------");

    // user input section.
    System.out.println("Enter the current world population");
    long initialPopulation = input.nextLong();

    System.out.println("Enter the percentage growth ");
    float growthRate = input.nextFloat();

    System.out.println("\n---------------------------------------------------------------");
    System.out.println("Year\t\tEstimated Population\t\tChange from prior year");

    System.out.println("---------------------------------------------------------------");

    float previousYearPopulation = initialPopulation;

    // local variable to hold the year when the population is doubled and initialized to -1.
    int doubledPopulationYear = -1;
    for(int year=1;year<=75;year++)
    {
      // Computation for the population
      float estimatedPopulation = previousYearPopulation * (1 + (growthRate/100));

      // Computation for population difference.
      long numericalIncrease = (long)estimatedPopulation - (long)previousYearPopulation;
      System.out.println(year+"\t\t\t"+(long)estimatedPopulation+"\t\t\t\t\t\t"+numericalIncrease );

      // Check for year for doubled population.
      if(estimatedPopulation >= 2 * initialPopulation && doubledPopulationYear ==-1)
      {
        doubledPopulationYear = year;
      }

      // Saving the calculated population to use in next year computation.
      previousYearPopulation = estimatedPopulation;
    }
    System.out.println("---------------------------------------------------------------");

    // Check if the year with doubled population exist.
    if(doubledPopulationYear == -1) {
      System.out.println("With the given info the initial population would never get doubled in next 75 years.");
    }
    else {
      System.out.println("The initial population would be double after "+doubledPopulationYear+" years from now.");
    }
  }
}
