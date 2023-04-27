import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testAddition() {
        int num1 = 6;
        int num2 = 8;
        int expectedResult = 14;

        assertEquals(expectedResult, Calculator.add(num1, num2));
    }

    @Test
    public void testTipCalculator() {
        double cost = 22.56;
        double tipPercentage = 15;
        double tip = 3.38;

        assertEquals(tip, Calculator.calculateTip(cost, tipPercentage), .01);
    }

    @Test
    public void testIsCodeup() {
        String codeup = "CodeUp";
        boolean verify = true;

        assertEquals(verify, WarmupExercises.isCodeup(codeup));
    }

    @Test
    public void testArrayLists(){
        ArrayList<String> languages = new ArrayList<>();
        ArrayList<String> moreLanguages = new ArrayList<>();
        boolean verify = false;

        assertNotSame(verify, WarmupExercises.arrayListEquality(languages, moreLanguages));
    }

    @Test
    public void testArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testTrue (){
        String language = "PHP";

        assertTrue(language.contains("H"));
    }

    @Test
    public void testFalse(){
        String language = "PHP";

        assertFalse(language.contains("J"));
    }

    @Test
    public void testNullTrue(){
        String language = null;

        assertNull(language);
    }

    @Test
    public void testNullFalse(){
        String language = "null";

        assertNotNull(language);
    }
}
