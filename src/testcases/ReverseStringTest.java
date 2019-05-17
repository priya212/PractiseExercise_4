/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test that given string is transpose or not .
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rs=new ReverseString();
    @Test
    public void reverseTheEachWordFromString() {
        String input="a quick brown fox jumps over the lazy dog";
        String output=rs.reverse(input);
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",output);
    }
    @Test
    public void reverseTheEachWordFromStringFailure() {
        String input="a quick brown fox jumps over the lazy dog";
        String output=rs.reverse(input);
        assertNotEquals("a kciuq nworb xof spmuj revo eht yzal dog",output);
    }
    @Test
    public void ifInputIsEmptyStringReturnNull() {
        String input="";
        String output=rs.reverse(input);
        assertEquals(null,output);
    }
}