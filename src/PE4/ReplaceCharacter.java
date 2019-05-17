/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to replace character d with f and character l with t.
 */

public class ReplaceCharacter {
    public String replaceCharacter(String input) {
        if (input == "") {
            return null;
        } else {
            String output, output1;
            /* Replace the character d with f */
            output = input.replace('d', 'f');
            /* Replace the character l with t */
            output1 = output.replace('l', 't');
            System.out.println("Original String:" + input);
            System.out.println("New String:" + output1);
            return output1;
        }
    }
}
