/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test number of occurance of character in given string .
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OccuranceOfCharacterTest {
    private static  OccuranceOfCharacter oc;
    @BeforeClass
    public static void setup()
    {
        oc=new OccuranceOfCharacter();
    }
    @AfterClass
    public static void  teardown()
    {
        oc=null;
    }
    /* If found given chracter in string return count of character */
    @Test
    public  void ifFoundGivenCharacterReturnCount() {
        String input="Java is java again java again";
        char charc='a';
        int expected=10;
        int finalResult=oc.occurance(input,charc);
        assertEquals(expected,finalResult);
    }
    /* If not found given chracter in string return zero count */
    @Test
    public  void ifNotFoundGivenCharacterReturnCount() {
        String input="This is new thing";
        char charc='a';
        int expected=0;
        int finalResult=oc.occurance(input,charc);
        assertEquals(expected,finalResult);
    }
    /* Negative test case for not found given character in string */
    @Test
    public  void ifNotFoundGivenCharacterReturnCountFailure() {
        String input="This is new thing";
        char charc='a';
        int expected=0;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(10,finalResult);
    }
    /* Negative test case for found given character in string */
    @Test
    public  void ifFoundGivenCharacterReturnCountFailure() {
        String input="Java is java again java again";
        char charc='a';
        int expected=11;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(expected,finalResult);
    }
    /* If given input is empty string return -1 */
    @Test
    public  void ifInputIsNullReturn1() {
        String input="";
        char charc='a';
        int expected=11;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(-1,finalResult);
    }
}