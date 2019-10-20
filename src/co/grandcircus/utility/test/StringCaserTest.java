package co.grandcircus.utility.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.grandcircus.utility.StringCaser;

class StringCaserTest
{
   public static String caseId = "StringCaserTest.";
   @Test
   void testIsTitleCase()
   {
      String methodId = "testIsTitleCase(): ";
      
      String input = "This";
      boolean expected = true;
      assertTrue(
            StringCaser.isTitleCase(input),
            caseId + methodId + 
            "isTitleCase(\"" + input + "\") should have returned true.");
      
      input = "that";
      expected = false;
      assertFalse(StringCaser.isTitleCase(input),
            caseId + methodId + 
            "isTitleCase(\"" + input + "\") should have returned false.");
      
      input = "oTHER";
      expected = false;
      assertFalse(StringCaser.isTitleCase(input),
            caseId + methodId + 
            "isTitleCase(\"" + input + "\") should have returned false."); 
      
      input = "that is not";
      expected = false;
      assertFalse(StringCaser.isTitleCase(input),
            caseId + methodId + 
            "Passing a word with whitespace (\"" + input + "\") to isTitleCase() should have returned false.");
      
      input = "#that$ness";
      expected = false;
      assertFalse(StringCaser.isTitleCase(input),
            caseId + methodId + 
            "Passing a word with special characters (\"" + input + "\") to isTitleCase() should have returned false.");
   }
   
   @Test
   void testToTitleCase()
   {
      String methodId = "testToTitleCase(): ";
      
      String input = "This";
      String expected = "This";
      assertEquals(
            expected,
            StringCaser.toTitleCase(input),
            caseId + methodId + 
            "toTitleCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "that";
      expected = "That";
      assertEquals(
            expected,
            StringCaser.toTitleCase(input),
            caseId + methodId + 
            "toTitleCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "OTHER";
      expected = "Other";
      assertEquals(
            expected,
            StringCaser.toTitleCase(input),
            caseId + methodId + 
            "toTitleCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "that's another";
      expected = "That's another";
      assertEquals(
            expected,
            StringCaser.toTitleCase(input),
            caseId + methodId + 
            "toTitleCase(\"" + input + "\") should have returned \"" + expected + "\".");
   }
   
}
