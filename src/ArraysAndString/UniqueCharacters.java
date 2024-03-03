package ArraysAndString;

/* Implement an algorithm to determine if a string has unique characters */

public class UniqueCharacters {

    /* Time complexity - O(n) and space complexity */
    public static boolean isUnique(String string){
        char[] charArray = string.toCharArray();
        boolean[] charSet = new boolean[128];

        if (string.length() > 128) return false;

        for (int i = 0; i < string.length(); i++){

            if(charArray[i]< 65) return false;

            if(!charSet[charArray[i]]){
                charSet[charArray[i]] = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String[] testCases = {"abcd", "aabcd", "aAbcd", "ABCD", "AABCD", "A#bcd"};
        for (String testString:testCases) {
            boolean result = isUnique(testString);
            System.out.println("isUnique -> "+result);
        }
    }
}
