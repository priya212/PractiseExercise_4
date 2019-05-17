/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test where given characters replace or not.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter rc=new ReplaceCharacter();
    @Test
    public void foundDAndLReplaceWithFAndT() {
        String input="daily dry";
        String output=rc.replaceCharacter(input);
        assertEquals("faity fry",output);
    }
    @Test
    public void foundDAndLReplaceWithFAndTFailure() {
        String input="daily dry";
        String output=rc.replaceCharacter(input);
        assertNotEquals("faityfry",output);
    }
    @Test
    public void inputIsNullReturnNull() {
        String input="";
        String output=rc.replaceCharacter(input);
        assertEquals(null,output);
    }
    @Test
    public void inputIsNullReturnNullFailure() {
        String input="";
        String output=rc.replaceCharacter(input);
        assertNotEquals("faity fry",output);
    }
}