/**
 * Created by-Priyanka
 * Date:-16-5-2019
 * This program is used to sort the given string paragraph in alphabetical order .
 */

import java.util.Arrays;

public class Sorting {
    public String[] sorting(String input) {
        if (input == "") {
            return null;
        } else {
            String[] characterArray = input.split(" ");
            /* This will sort the given string alphabetical order */
            Arrays.sort(characterArray);
            for (int i = 0; i < characterArray.length; i++) {
                System.out.println(characterArray[i]);
            }
            return characterArray;
        }
    }
}
