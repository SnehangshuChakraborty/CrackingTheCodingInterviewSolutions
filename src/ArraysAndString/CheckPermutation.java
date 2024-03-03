package ArraysAndString;

/* Given Two Strings,Check If One Is Permutation Of The Other */

import java.util.Arrays;

public class CheckPermutation {

    public static String sort(String testString){
        char[] charArray = testString.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    /** if the length of both the strings are different return false
     * else return whether (sorted) first string is equal to (sorted) second string
     * **/
    public static boolean hasPermutation(String testStringOne, String testStringTwo){
        if (testStringOne.length() != testStringTwo.length()) {
            return false;
        } else return sort(testStringOne).equals(sort(testStringTwo));
    }

    public static void main(String[] args){
        boolean result = hasPermutation("abcd", "dcba");
        System.out.println("hasPermutation -> "+ result);
    }
}
