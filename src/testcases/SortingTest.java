/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test given string sorted in alphabetical order or not .
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    private static Sorting sort;
    @BeforeClass
    public static void setup()
    {
        sort=new Sorting();
    }
    @AfterClass
    public static void teardown()
    {
        sort=null;
    }
    /* Sorted given string alphabetically */
    @Test
    public void sortedGivenStringInAlphabeticalOrder() {
        String input="hello i am herry";
        String[] expectedOutput={"am","hello","herry","i"};
        String[] output=sort.sorting(input);
        assertArrayEquals(expectedOutput,output);
    }
    /* Failure case for Sorted given string alphabetically */
    @Test
    public void sortedGivenStringAlphabeticallyFailure() {
        String input="hello i am herry";
        String[] expectedOutput={"am","herry","hello","i"};
        String[] output=sort.sorting(input);
        assertNotEquals(expectedOutput,output);
    }
    /* If given input is empty string return null */
    @Test
    public void ifInputIsEmptyStringReturnsNull() {
        String input="";
        String[] output=sort.sorting(input);
        assertArrayEquals(null,output);
    }
}