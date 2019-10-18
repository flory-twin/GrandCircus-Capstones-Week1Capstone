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
   }
   
}
