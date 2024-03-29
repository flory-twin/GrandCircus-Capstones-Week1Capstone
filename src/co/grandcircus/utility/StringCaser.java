package co.grandcircus.utility;

public class StringCaser
{
   /**
    * Takes the passed word and check's whether it's Title Case. If the passed
    * character contains any non-letter characters, including whitespace, the check
    * will return false.
    * 
    * @param toCheck The String to be checked.
    * @return True if the parameter is in Title Case, false otherwise.
    */
   public static boolean isTitleCase(String toCheck)
   {
      boolean returnVal = true;
      
      // Check failure conditions first.
      if (toCheck.length() > 0 && !toCheck.matches("\\w"))
      {
         // Iterate over String....
         char[] characters = toCheck.toCharArray();
         for (int charIndex = 0; charIndex < toCheck.length(); charIndex++)
         {
            if (charIndex == 0)
            {
               // This is the first character. Is it uppercase?
               // Be sure to exempt non-alphabetic characters from the check!!
               if (Character.isAlphabetic(characters[charIndex]))
               {
                  if (!Character.isUpperCase(characters[charIndex]))
                  {
                     returnVal &= false; // Using this solution rather than a return
                     // or break takes more resources, but I prefer to use break minimally
                     // and return only at the end of a method.
                  }
               }
            } else
            {
               // This is a character other than the first. Is it lowercase?
               if (!Character.isLowerCase(characters[charIndex]))
               {
                  returnVal &= false;
               }
            }
         }
      } else
      {
         returnVal = false;
      }
      
      return returnVal;
   }
   
   public static boolean isLowerCase(String toCheck)
   {
      boolean returnVal = true;
      
      // Check failure conditions first.
      if (toCheck.length() > 0 && !toCheck.matches("\\w"))
      {
         // Iterate over String....
         char[] characters = toCheck.toCharArray();
         for (int charIndex = 0; charIndex < toCheck.length(); charIndex++)
         {
            // This is a character other than the first. Is it lowercase?
            // Be sure to exempt non-alphabetic characters from the check!!
            if (Character.isAlphabetic(characters[charIndex]))
            {
               if (!Character.isLowerCase(characters[charIndex]))
               {
                  returnVal &= false;
               }
            }
         }
      } 
      else
      {
         returnVal = false;
      }
      
      return returnVal;
   }
   
   public static boolean isUpperCase(String toCheck)
   {
      boolean returnVal = true;
      
      // Check failure conditions first.
      if (toCheck.length() > 0 && !toCheck.matches("\\w"))
      {
         // Iterate over String....
         char[] characters = toCheck.toCharArray();
         for (int charIndex = 0; charIndex < toCheck.length(); charIndex++)
         {
            // This is a character other than the first. Is it lowercase?
            // Be sure to exempt non-alphabetic characters from the check!!
            if (Character.isAlphabetic(characters[charIndex]))
            {
               if (!Character.isUpperCase(characters[charIndex]))
               {
                  returnVal &= false;
               }
            }
         }
      } 
      else
      {
         returnVal = false;
      }
      
      return returnVal;
   }
   
   /**
    * Convert the passed word to Title Case. Whitespace and special characters are
    * accepted by this method, but may not produce acceptable results. For example,
    * "that's another" translates to "That's another".
    * 
    * @param toConvert The String to convert.
    * @return The converted String.
    */
   public static String toTitleCase(String toConvert)
   {
      String returnVal = "";
      
      if (toConvert.length() > 0)
      {
         returnVal += Character.toUpperCase(toConvert.charAt(0));
         for (int remainingCharIndex = 1; remainingCharIndex < toConvert.length(); remainingCharIndex++)
         {
            returnVal += Character.toLowerCase(toConvert.charAt(remainingCharIndex));
         }
      }
      
      return returnVal;
   }
}
