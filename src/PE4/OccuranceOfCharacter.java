/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to find out occurance of specific character in given string .
 */

public class OccuranceOfCharacter {
    public int occurance(String input,char charc) {
        if(input==null) {
            return -1;
        }
        else {
            String output = input.replace(charc + "", "");
            int count;
            /* This formula find out how many times given character is occur in  given string*/
            count = input.length() - output.length();
            System.out.println("Occurance Of " + charc + ":" + count);
            return count;
        }
    }
}
