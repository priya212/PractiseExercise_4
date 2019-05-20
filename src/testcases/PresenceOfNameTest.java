/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test given regex present in given string or not .
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PresenceOfNameTest {
    private static PresenceOfName pn;
    @BeforeClass
    public static void setup()
    {
        pn=new PresenceOfName();
    }
    @AfterClass
    public static void  teardown()
    {
        pn=null;
    }
    /* If found given regex return true */
    @Test
    public void ifFoundHarryReturnTrue() {
        String input="This is Harry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertEquals(true,finalResult);
    }
    /* Failure test case for If found given regex return true */
    @Test
    public void ifFoundHarryReturnTrueFailure() {
        String input="This is Harry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertNotEquals(false,finalResult);
    }
    /* If not found regex return false */
    @Test
    public void ifNotFoundHarryReturnFalse() {
        String input="This is henry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertEquals(false,finalResult);
    }
    /* Failure testcase for If not found regex return false */
    @Test
    public void ifNotFoundHarryReturnFalseFailure() {
        String input="This is henry";
        String name="Harry";
        boolean finalResult=pn.presenceOfName(name,input);
        assertNotEquals(true,finalResult);
    }
}