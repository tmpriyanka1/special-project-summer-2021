package assignment2;

/**
 * Class to calculate the heart rates.
 *
 * @author Malathi Priyanka Tatikonda
 */
public class HeartRates {
  private String firstName;
  private String lastName;
  private int birthYear;
  private int currentYear;

  /**
   * Constructor to construct the instance of assignment2.HeartRates class.
   * @param firstName
   *    The first name of the person.
   * @param lastName
   *    The last name of the person.
   * @param birthYear
   *    The birth year of the person.
   * @param currentYear
   *    The current year.
   */
  public HeartRates(String firstName, String lastName, int birthYear, int currentYear)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;
    this.currentYear = currentYear;
  }

  /**
   * @return
   *    The first name of the person.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return
   *    The last name of the person.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @return
   *    The birth year of the person.
   */
  public int getBirthYear() {
    return birthYear;
  }

  /**
   * @return
   *    The current year.
   */
  public int getCurrentYear() {
    return currentYear;
  }

  /**
   * Sets the first name of the person.
   * @param firstName
   *    The first name of the person.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Sets the first name of the person.
   * @param lastName
   *    The last name of the person.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Sets the birth year of the person.
   * @param birthYear
   *    The birth year of the person.
   */
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  /**
   * Sets the current year.
   * @param currentYear
   *    The current year.
   */
  public void setCurrentYear(int currentYear) {
    this.currentYear = currentYear;
  }

  /**
   * Method to calculate the person's age.
   * @return
   *    The age of the person.
   */
  public int getAge() {
    return currentYear - birthYear;
  }

  /**
   * Method to calculate the maximum heart rate of the person.
   * @return
   *    The maximum heart rate of the person.
   */
  public int getMaximumHeartRate(){
    return 220 - getAge();
  }

  /**
   * Method to calculate the minimum target heart rate of the person.
   * @return
   *    The minimum target heart rate of the person.
   */
  public double getMinimumTargetHearRate(){

    return 0.5 * getMaximumHeartRate();
  }

  /**
   * Method to calculate the maximum target heart rate of the person.
   * @return
   *    The maximum target heart rate of the person.
   */
  public double getMaximumTargetHearRate(){
    return 0.85 * getMaximumHeartRate();
  }
}
