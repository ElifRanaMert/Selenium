package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day02_JUnitAssertions {

    /*
    What is assertion?
    -Assertion is used to check if expected equals to atual
    -Every test case must have an assertion
        expected = actual ==> PASS
        expected != actual ==> FAIL
    ***********************
    In JUnit5 Assertion class is used to do assertion (Assert class is used in JUnit4)
         Assertion.assertEquals
         Assertion.assertTrue
         Assertion.assertFalse
         Assertion.assertNull
    **********************
    These assertions are HARD ASSERTS, it means if assertion fails, test case STOPS and do not execute the rest

     */

    @Test
    public void assertionsTest(){
        Assertions.assertEquals(5,5);
        Assertions.assertEquals("apple","APPLE".toLowerCase());

        Assertions.assertTrue(5>3);
        Assertions.assertTrue(true);
        Assertions.assertTrue("selenium".contains("e"));

        Assertions.assertFalse(3>5);
        Assertions.assertFalse(false);
        Assertions.assertFalse("java".contains("e"));

        char [] expected = {'j', 'a','v','a'};
        char [] actual = "java".toCharArray();
        Assertions.assertArrayEquals(expected, actual);

        String str = null;
        Assertions.assertNull(str);
        Assertions.assertNotNull("NOT NULL VALUE");

        //third
        //fourth
        //fifth
        //1


    }



}
