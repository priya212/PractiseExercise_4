/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to find out given name or regex present in string or not .
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceOfName {
    public  boolean presenceOfName(String name,String input) {
        /* Pattern compiles the given input string*/
        Pattern pattern=Pattern.compile(name);
        /* Matches the specific regex with input string */
        Matcher matcher=pattern.matcher(input);
        boolean flag=false;
        /* Finds given regex present in string or not */
        if(matcher.find()) {
            flag=true;
            System.out.println("Is "+name+" there ? "+flag);
            return true;
        }
        else {
            System.out.println("Is "+name+" there ? "+flag);
            return false;
        }
    }
}
