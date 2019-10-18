package co.grandcircus.test;

import co.grandcircus.PigLatinTranslator;
/**
 * 
 * @author kflory
 *
 * Why "No JUnit"?
 * 
 * I'd ordinarily use JUnit for my test classes. But that would require a 
 *  classpath entry, and it would break the project for importers.
 *  Instead, I'm using the crappy built-in provided as a keyword.
 */
public class PigLatinTranslatorTestNoJunit
{
   public static final String printLabel = "PigLatinTranslatorTestNoJunit.testSingleWordTranslation: ";
   
   public static void main(String[] args)
   {
      testSingleWordTranslation();
   }
   
   public static void testSingleWordTranslation() {
      PigLatinTranslator underTest = new PigLatinTranslator();
      String actual = underTest.translateWord("This"); 
      assert actual.equals("isthay") : 
         (printLabel + "'This' should have translated to 'isthay'.");
      
      actual = underTest.translateWord("sentence"); 
      assert actual.equals("entencesay") : 
         (printLabel + "'sentence' should have translated to 'entencesay'.");
      
      actual = underTest.translateWord("exists"); 
      assert actual.equals("existsway") : 
         (printLabel + "'exists' should have translated to 'existsway'.");
      
      actual = underTest.translateWord("here"); 
      assert actual.equals("erehay") : 
         (printLabel + "'here' should have translated to 'erehay'.");
      //Self-imposed challenges:
      //pig
      //latin
      //1st
      //$&^(*
      //Wetherell-Jones
      //Tau\tnton
      //\0x03b5 \0x03bb \0x03bb \0x03b7 \0x03bd \0x03b9 \0x03ba \0x03ac 'ελληνικά', Greek (the language)
      
      
   }
   
}
