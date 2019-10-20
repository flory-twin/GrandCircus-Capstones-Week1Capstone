package co.grandcircus.utility.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.grandcircus.utility.StringCaser;

class StringCaserTest
{
   public static String caseId = "StringCaserTest.";
   @Test
   void testIsWordTitleCase()
   {
      String methodId = "testIsWordTitleCase(): ";
      
      String input = "This";
      boolean expected = true;
      assertTrue(
            StringCaser.isWordTitleCase(input),
            caseId + methodId + 
            "isWordTitleCase(\"" + input + "\") should have returned true.");
      
      input = "that";
      expected = false;
      assertFalse(StringCaser.isWordTitleCase(input),
            caseId + methodId + 
            "isWordTitleCase(\"" + input + "\") should have returned false.");
      
      input = "oTHER";
      expected = false;
      assertFalse(StringCaser.isWordTitleCase(input),
            caseId + methodId + 
            "isWordTitleCase(\"" + input + "\") should have returned false."); 
      
      input = "that is not";
      expected = false;
      assertFalse(StringCaser.isWordTitleCase(input),
            caseId + methodId + 
            "Passing a word with whitespace (\"" + input + "\") to isWordTitleCase() should have returned false.");
      
      input = "#that$ness";
      expected = false;
      assertFalse(StringCaser.isWordTitleCase(input),
            caseId + methodId + 
            "Passing a word with special characters (\"" + input + "\") to isWordTitleCase() should have returned false.");
   }
   
}
