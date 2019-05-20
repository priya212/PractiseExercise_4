/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test that given string is transpose or not .
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    private  static ReverseString rs;
    @BeforeClass
    public static void setup()
    {
        rs=new ReverseString();
    }
    @AfterClass
    public static void teardown()
    {
        rs=null;
    }
    /* Reverse the each word from given string */
    @Test
    public void reverseTheEachWordFromString() {
        String input="a quick brown fox jumps over the lazy dog";
        String output=rs.reverse(input);
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",output);
    }
    /* Failure testcase for Reverse the each word from given string */
    @Test
    public void reverseTheEachWordFromStringFailure() {
        String input="a quick brown fox jumps over the lazy dog";
        String output=rs.reverse(input);
        assertNotEquals("a kciuq nworb xof spmuj revo eht yzal dog",output);
    }
    /* If given input is empty string return null */
    @Test
    public void ifInputIsEmptyStringReturnNull() {
        String input="";
        String output=rs.reverse(input);
        assertEquals(null,output);
    }
}