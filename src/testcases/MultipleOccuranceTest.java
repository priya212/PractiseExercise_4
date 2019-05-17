/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to test multiple occurance of regular expression in given string.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class MultipleOccuranceTest {
  MultipleOccurance mo=new MultipleOccurance();
  @Test
  public void foundRegularExpressionInSequenceResultTrue() {
    String input="She sells seashells by the seashore";
    String name="se";
    String[] output={"Found at:4-6","Found at:10-12","Found at:27-29"};
    String[] actualOutput=mo.multipleoccurance(name,input);
    assertArrayEquals(output,actualOutput);
  }
  @Test
  public void notFoundRegularExpressionInSequenceResultNull() {
    String input="Hello";
    String name="se";
    String[] actualOutput=mo.multipleoccurance(name,input);
    assertArrayEquals(null,actualOutput);
  }
}