/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test given string sorted in alphabetical order or not .
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort=new Sorting();
    @Test
    public void sortedGivenStringAlphebatically() {
        String input="hello i am herry";
        String[] expectedOutput={"am","hello","herry","i"};
        String[] output=sort.sorting(input);
        assertArrayEquals(expectedOutput,output);
    }
    @Test
    public void sortedGivenStringAlphabeticallyFailure() {
        String input="hello i am herry";
        String[] expectedOutput={"am","herry","hello","i"};
        String[] output=sort.sorting(input);
        assertNotEquals(expectedOutput,output);
    }
    @Test
    public void ifInputIsEmptyStringReturnsNull() {
        String input="";
        String[] output=sort.sorting(input);
        assertArrayEquals(null,output);
    }
}