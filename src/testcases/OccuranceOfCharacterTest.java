/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test number of occurance of character in given string .
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class OccuranceOfCharacterTest {
    OccuranceOfCharacter oc=new OccuranceOfCharacter();
    @Test
    public  void ifFoundGivenCharacterReturnCount() {
        String input="Java is java again java again";
        char charc='a';
        int expected=10;
        int finalResult=oc.occurance(input,charc);
        assertEquals(expected,finalResult);
    }
    @Test
    public  void ifNotFoundGivenCharacterReturnCount() {
        String input="This is new thing";
        char charc='a';
        int expected=0;
        int finalResult=oc.occurance(input,charc);
        assertEquals(expected,finalResult);
    }
    @Test
    public  void ifNotFoundGivenCharacterReturnCountFailure() {
        String input="This is new thing";
        char charc='a';
        int expected=0;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(10,finalResult);
    }
    @Test
    public  void ifFoundGivenCharacterReturnCountFailure() {
        String input="Java is java again java again";
        char charc='a';
        int expected=11;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(expected,finalResult);
    }
    @Test
    public  void ifInputIsNullReturn1() {
        String input="";
        char charc='a';
        int expected=11;
        int finalResult=oc.occurance(input,charc);
        assertNotEquals(-1,finalResult);
    }
}