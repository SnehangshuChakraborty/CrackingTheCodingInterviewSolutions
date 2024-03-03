package ArraysAndString;

/**
 * Given two strings, write a function to check if they are
 * one edit (or zero edits) away
 */
public class OneAway {

    public static void main(String[] args){
        System.out.println("String abcde and abcdefg are one edit away? "+isOneEditAway("abcde","abcdefg"));
    }

    private static boolean isOneEditAway(String stringOne, String stringTwo) {

        if (Math.abs(stringOne.length()-stringTwo.length()) > 1) return false;

        int[] asciiTable = new int[128];
        int editCounter = 0;

        //Fill up the ascii table for string 1
        for (int i = 0; i<stringOne.length(); i++){
            asciiTable[stringOne.charAt(i)]++;
        }

        //Fill up the ascii table for string 2
        for (int j = 0; j< stringTwo.length(); j++){
            asciiTable[stringTwo.charAt(j)]++;
        }

        //Count the number of occurence of each char, if >1 charecters with array value as 1 return false
        for (int k = 0; k < 128; k++){
            if (asciiTable[k] == 1) editCounter++;
        }

        return editCounter <= 1;
    }
}
