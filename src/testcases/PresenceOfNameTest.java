/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test given regex present in given string or not .
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class PresenceOfNameTest {
    PresenceOfName pn=new PresenceOfName();
    @Test
    public void ifFoundHarryReturnTrue() {
        String input="This is Harry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertEquals(true,finalResult);
    }
    @Test
    public void ifFoundHarryReturnTrueFailure() {
        String input="This is Harry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertNotEquals(false,finalResult);
    }
    @Test
    public void ifNotFoundHarryReturnFalse() {
        String input="This is henry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertEquals(false,finalResult);
    }
    @Test
    public void ifNotFoundHarryReturnFalseFailure() {
        String input="This is henry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertNotEquals(true,finalResult);
    }
}