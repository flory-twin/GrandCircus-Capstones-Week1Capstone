package co.grandcircus;

import java.util.Scanner;

import co.grandcircus.utility.PromptUtility;

public class MainContainer
{
   
   public static void main(String[] args)
   {
      PigLatinTranslator plTranslator = new PigLatinTranslator();
      
      String toPL = PromptUtility.promptForString("Please enter a word to...uh...piglatinize?");
      boolean doContinue = true;
      do {
         System.out.println("Your word is \"" + plTranslator.translateWord(toPL) + "\".");
         doContinue &= PromptUtility.promptForYN("Want to continue (y/n)?");
         if  (doContinue) {
            toPL = PromptUtility.promptForString("Enter another word to ligpatin...whatever that word was.");
         }
      } while (doContinue);
      

   }
   
}
