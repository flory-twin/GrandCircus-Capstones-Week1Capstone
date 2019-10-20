package co.grandcircus;

import java.util.Scanner;

import co.grandcircus.utility.PromptUtility;

public class MainContainer
{
   
   public static void main(String[] args)
   {
      PigLatinTranslator plTranslator = new PigLatinTranslator();
      
      String toPL = PromptUtility.promptForString("Please enter a word to...uh...piglatinize?");
      System.out.println("Your word is \"" + plTranslator.translateWord(toPL) + "\".");

   }
   
}
