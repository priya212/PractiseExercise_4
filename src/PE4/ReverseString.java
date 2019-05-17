/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to transpose the given string .
 */

public class ReverseString {
    public String reverse(String input) {
        if (input == "") {
            return null;
        } else {
            String[] output;
            String temp = "";
            /* This is used to split given string according to space */
            String[] array1 = input.split(" ");
            output = new String[array1.length];
            /* This is used to transpose the each word from given array */
            for (int i = 0; i < array1.length; i++) {
                temp = "";
                for (int j = array1[i].length() - 1; j >= 0; j--) {
                    temp = temp + array1[i].charAt(j) + "";
                }
                output[i] = temp;
            }
            String output1 = "";
            for (int i = 0; i < output.length; i++) {
                output1 += output[i] + " ";
            }
            return output1.trim();
        }
    }
}
