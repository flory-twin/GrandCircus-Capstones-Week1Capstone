package co.grandcircus;

import co.grandcircus.utility.StringCaser;

enum Case{UPPER, LOWER, TITLE}

public class PigLatinTranslator
{
   public final String vowelRegex = "[AEIOUYaeiouy]"; 
   public final String consRegex = "[BCDFGHIJKLMNPQRSTVWXYbcdfghijklmnpqrstvwxy]";
   public final String puncRegex = "[~`!@#$%^&*()-_=+\\[\\]{};:'\\\",<>?/\\]";
   
   public String translateWord(String wordToBeTranslated)
   {
      String translated = "";
      //Case wordCase;
      //if (wordToBeTranslated.)
      //For Extended Challenge 1, if the word's cased as Title Case, we'll need to restore that after we finish.
      //For all other cases, including MiXeD CAsING, UPPERCASE, and lowercase, leaving the letter casing the same will not affect the word's casing.
      boolean isTitleCase = StringCaser.isTitleCase(wordToBeTranslated);
      
      int cIndex = 0;
      for (char c : wordToBeTranslated.toCharArray())
      {
         String character = Character.toString(c);
         
         //
         //Is this a vowel?
         if (character.matches(vowelRegex)) {
            //This is a vowel, and it's the first character in the word.
            if (cIndex == 0) {
               //This is a special case: add "way" to the end of the word.
               translated = wordToBeTranslated + "way";
               //EC1: Convert back to Titlecase, if necessary.
               if (isTitleCase)
               {
                  translated = StringCaser.toTitleCase(translated);
               }
               //We don't want ANY further action to occur. Return right now!
               return translated;
            } 
            else {
               //This is a vowel...and we've reached it after traversing several consonants.
               translated = wordToBeTranslated.substring(cIndex, wordToBeTranslated.length()) + translated + "ay";
               //EC1: Convert back to Titlecase, if necessary.
               if (isTitleCase)
               {
                  translated = StringCaser.toTitleCase(translated);
               }
               //We don't want any further action to occur.
               return translated;
            }   
         }
         //Is this a consonant?
         else if (character.matches(consRegex))
         {
            translated += character; //Causes word to grow from right
         }
       //There are non-word and non-printing characters that could conceivably wind up here!
         else
         {
            //For now, just go on to the next letter.
            
         }
         
         //Remember to manually update the index!
         cIndex++;
      }
      
      //If we get to this point, something went seriously wrong! 
      //Dump debug information.
      return "ERROR: translating " + wordToBeTranslated +
            " with result "+ translated;
   }
   
   public String translateSentence(String toBeTranslated)
   {
      return "";
   }
}
