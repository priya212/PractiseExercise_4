/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to find out the multiple occurance of regular expression in given string.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {
    public  String[] multipleoccurance(String name,String input) {
        /* Pattern compiles the given input string */
        Pattern pattern=Pattern.compile(name);
        Matcher matcher=pattern.matcher(input);
        int index=0;
        int count=0;
        /* This will find at what location in string the given regex occure */
        while(matcher.find()) {
            count++;
        }
        if(count==0) {
            return null;
        }
        else {
            String[] finalResult = new String[count];
            matcher = pattern.matcher(input);
            /* This will find at what location in string the given regex occure at store in string array.*/
            while (matcher.find()) {
                finalResult[index] = "Found at:" + matcher.start() + "-" + matcher.end();
                index++;
            }
            for (int i = 0; i < finalResult.length; i++) {
                System.out.println(finalResult[i]);
            }
            return finalResult;
        }
    }
}
