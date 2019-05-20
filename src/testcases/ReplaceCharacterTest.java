/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test where given characters replace or not.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    private static ReplaceCharacter rc;
    @BeforeClass
    public static void setup()
    {
        rc=new ReplaceCharacter();
    }
    @AfterClass
    public static void  teardown()
    {
        rc=null;
    }
    /* If found given characters in string then replace it with specified character */
    @Test
    public void foundDAndLReplaceWithFAndT() {
        String input="daily dry";
        String output=rc.replaceCharacter(input);
        assertEquals("faity fry",output);
    }
    /* Failure senario for If found given characters in string then replace it with specified character*/
    @Test
    public void foundDAndLReplaceWithFAndTFailure() {
        String input="daily dry";
        String output=rc.replaceCharacter(input);
        assertNotEquals("faityfry",output);
    }
    /* If given input is empty string return null */
    @Test
    public void inputIsNullReturnNull() {
        String input="";
        String output=rc.replaceCharacter(input);
        assertEquals(null,output);
    }
    /* Failure senario for If given input is empty string return null */
    @Test
    public void inputIsNullReturnNullFailure() {
        String input="";
        String output=rc.replaceCharacter(input);
        assertNotEquals("faity fry",output);
    }
}