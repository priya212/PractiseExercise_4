/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test multiple occurance of regular expression in given string.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultipleOccuranceTest {
  private static  MultipleOccurance mo;
  @BeforeClass
  public static void setup()
  {
    mo=new MultipleOccurance();
  }
  @AfterClass
  public static void  teardown()
  {
    mo=null;
  }
  /* If found regex in string return location of regex where they found */
  @Test
  public void foundRegularExpressionInSequenceResultTrue() {
    String input="She sells seashells by the seashore";
    String name="se";
    String[] output={"Found at:4-6","Found at:10-12","Found at:27-29"};
    String[] actualOutput=mo.multipleoccurance(name,input);
    assertArrayEquals(output,actualOutput);
  }
  /* If not found regex in string return null */
  @Test
  public void notFoundRegularExpressionInSequenceResultNull() {
    String input="Hello";
    String name="se";
    String[] actualOutput=mo.multipleoccurance(name,input);
    assertArrayEquals(null,actualOutput);
  }
}