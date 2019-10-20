package co.grandcircus.utility;

import java.util.Scanner;

public class PromptUtility
{
   // Not in the least bit thread-safe...but at least safe-er.
   private static Scanner inputScanner = new Scanner(System.in);
   
   public static String promptForString(String prompt)
   {
      System.out.println(prompt); 
      return inputScanner.nextLine();
   }
   
   public static int promptForInt(String prompt)
   {
      System.out.println(prompt);
      int toBeReturned = inputScanner.nextInt(); 
      //Clear the scanner before returning...
      inputScanner.nextLine();
      return toBeReturned;
   }
   
   public static boolean promptForBoolean(String prompt)
   {
      boolean returnVal = false;
      
      System.out.println(prompt);
      
      String trueFalseString = inputScanner.nextLine();
      switch (trueFalseString.toLowerCase())
      {
      case "true":
      case "t":
      case "1":
         returnVal |= true;
      case "false":
      case "f":
      case "0":
         returnVal = false;
      case "get me out of here!":
         returnVal |= false;
      default:
         System.out.println("That's not a boolean value.");
         System.out.println("Acceptible values are \"true\", \"false\", \"t\", \"f\", \"1\", \"0\" and \"GET ME OUT OF HERE!.");
         System.out.println("Please try again.");
         returnVal |= promptForBoolean(prompt);   
      }
      
      return returnVal;
   }
   
   public static boolean promptForYN(String prompt)
   {
      boolean returnVal = false;
      
      System.out.println(prompt);
      
      String trueFalseString = inputScanner.nextLine();
      switch (trueFalseString.toLowerCase())
      {
      case "y":
      case "yes":
         returnVal |= true;
         break;
      case "n":
      case "no":
         returnVal |= false;
         break;
      case "oh **** stopstopstop\"":
         returnVal |= false;
         break;
      default:
         System.out.println("That's not a yes/no value.");
         System.out.println("Acceptible values are \"yes\", \"y\", \"no\", \"n\", and \"oh **** stopstopstop\".");
         System.out.println("Please try again.");
         returnVal |= promptForBoolean(prompt);     
      }
      
      return returnVal;
   }
}
