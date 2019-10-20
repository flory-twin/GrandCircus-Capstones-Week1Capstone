package co.grandcircus;

import java.util.Scanner;

import co.grandcircus.utility.PromptUtility;

public class MainContainer
{
   
   public static void main(String[] args)
   {
      PigLatinTranslator plTranslator = new PigLatinTranslator();
      
      System.out.println("Welcome to the Pig Latin Translator!");
      String toPL = "";
      boolean doContinue = true;
      do {
         toPL = PromptUtility.promptForString("Enter a line to be translated: ");
         System.out.println(plTranslator.translateWord(toPL));
         doContinue = PromptUtility.promptForYN("Translate another line? (y/n): ");
      } while (doContinue);
      

   }
   
}
