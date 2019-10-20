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
   
   @Test
   void testIsLowerCase()
   {
      String methodId = "testIsLowerCase(): ";
      
      String input = "this";
      boolean expected = true;
      assertEquals(
            expected,
            StringCaser.isLowerCase(input),
            caseId + methodId + 
            "isLowerCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "THIS";
      expected = false;
      assertEquals(
            expected,
            StringCaser.isLowerCase(input),
            caseId + methodId + 
            "isLowerCase(\"" + input + "\") should have returned \"" + expected + "\".");
   
      input = "tHis";
      expected = false;
      assertEquals(
            expected,
            StringCaser.isLowerCase(input),
            caseId + methodId + 
            "isLowerCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "this hat";
      expected = true;
      assertEquals(
            expected,
            StringCaser.isLowerCase(input),
            caseId + methodId + 
            "isLowerCase should regard spaces as not affecting case.");
      
      input = "this!$hat";
      expected = true;
      assertEquals(
            expected,
            StringCaser.isLowerCase(input),
            caseId + methodId + 
            "isLowerCase should regard ~`!@#$%^&*()-_=+[]{};:'\",<>?/\\ as not affecting the string's case.");
   }
   
   @Test
   void testIsUpperCase()
   {
      String methodId = "testIsUpperCase(): ";
      
      String input = "this";
      boolean expected = false;
      assertEquals(
            expected,
            StringCaser.isUpperCase(input),
            caseId + methodId + 
            "isUpperCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "THIS";
      expected = true;
      assertEquals(
            expected,
            StringCaser.isUpperCase(input),
            caseId + methodId + 
            "isUpperCase(\"" + input + "\") should have returned \"" + expected + "\".");
   
      input = "tHis";
      expected = false;
      assertEquals(
            expected,
            StringCaser.isUpperCase(input),
            caseId + methodId + 
            "isUpperCase(\"" + input + "\") should have returned \"" + expected + "\".");
      
      input = "THIS HAT";
      expected = true;
      assertEquals(
            expected,
            StringCaser.isUpperCase(input),
            caseId + methodId + 
            "isUpperCase should regard spaces as not affecting case.");
      
      input = "THIS!$HAT";
      expected = true;
      assertEquals(
            expected,
            StringCaser.isUpperCase(input),
            caseId + methodId + 
            "isUpperCase should regard ~`!@#$%^&*()-_=+[]{};:'\",<>?/\\ as not affecting case.");
   }
}
