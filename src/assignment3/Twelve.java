package assignment3;

/**
 * Class to print twelve days of christmas song lyrics.
 *
 * @author Matalhi Priyanka Tatikonda
 */
public class Twelve {
  /**
   * Main method to start the program.
   */
  public static void main(String[] args)
  {
    System.out.println("TWELVE DAYS OF CHRISTMAS SONG LYRICS");
    System.out.println("---------------------------------------");

    // for loop for iterate
    for (int day = 1; day <= 12; day++)
    {
    // declaration of local variable
      String dayString;
      //Switch statement is used to print the day
      switch(day)
      {
        case 1 :
          dayString = "first";
          break;
        case 2 :
          dayString = "second";
          break;
        case 3 :
          dayString = "third";
          break;
        case 4 :
          dayString = "fourth";
          break;
        case 5 :
          dayString = "fifth";
          break;
        case 6 :
          dayString = "sixth";
          break;
        case 7 :
          dayString = "seventh";
          break;
        case 8 :
          dayString = "eight";
          break;
        case 9 :
          dayString = "ninth";
          break;
        case 10 :
          dayString = "tenth";
          break;
        case 11 :
          dayString = "eleventh";
          break;
        default:
          dayString = "twelfth";
          break;
      }


      System.out.println();
      // printing common lyrics
      System.out.println("On the " + dayString + " day of Christmas my true love gave to me");

       // Switch statement is used to print the lyrics
       switch(day)
       {
         case 12 :
           System.out.print("twelve drummers drumming, ");
         case 11 :
           System.out.println("eleven pipers piping, ");
         case 10 :
           System.out.print("ten lords a leaping, ");
         case 9 :
           System.out.println("nine ladies dancing, ");
         case 8 :
           System.out.print("eight maids a milking, ");
         case 7 :
           System.out.println("seven swans a swimming, ");
         case 6 :
           System.out.print("six geese a laying, ");
         case 5 :
           System.out.println("five gold rings, ");
         case 4 :
           System.out.print("four calling birds, ");
         case 3 :
           System.out.println("three French hens, ");
         case 2 :
           System.out.print("two turtle doves and ");
         case 1 :
           System.out.println("a partridge in a pear tree. ");

       }
    }
  }
}
