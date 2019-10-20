package co.grandcircus.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.grandcircus.PigLatinTranslator;
/**
 * 
 * @author kflory
 *
 */
public class PigLatinTranslatorTest
{
   public static final String caseId = "PigLatinTranslatorTest.";
   
   @Test
   void testSingleWordTranslation() {
      String methodId = "testSingleWordTranslation: ";
      PigLatinTranslator underTest = new PigLatinTranslator();
      
      assertEquals("Isthay",
         underTest.translateWord("This"), 
         caseId + methodId + "'This' should have translated to 'Isthay'.");
      
      assertEquals("entencesay",
            underTest.translateWord("sentence"), 
            caseId + methodId + "'sentence' should have translated to 'entencesay'.");
      
      assertEquals("EXISTSWAY",
            underTest.translateWord("EXISTS"), 
            caseId + methodId + "'exists' should have translated to 'existsway'.");
      
      assertEquals("erehay",
            underTest.translateWord("here"), 
            caseId + methodId + "'here' should have translated to 'erehay'.");
      //Self-imposed challenges, if time permits:
      //pig
      //latin
      //1st
      //$&^(*
      //Wetherell-Jones
      //Tau\tnton
      //\0x03b5 \0x03bb \0x03bb \0x03b7 \0x03bd \0x03b9 \0x03ba \0x03ac 'ελληνικά', Greek (the language)
      
      
   }
   
}
