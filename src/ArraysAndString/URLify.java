package ArraysAndString;

public class URLify {

    public static String fillWhiteSpace(String someRandomString, int totalLength){
        char[] characterArray = someRandomString.toCharArray();
        int whiteSpaceCount = 0;
        int newLength = 0;

        //count total white spaces
        for (int i = 0; i < totalLength; i++){
            if(characterArray[i] == ' '){
                whiteSpaceCount++;
            }
        }

        newLength = totalLength + whiteSpaceCount*2;

        for (int i = totalLength-1; i >= 0; i--){
            if(characterArray[i] == ' '){
                characterArray[newLength-1] = '0';
                characterArray[newLength-2] = '2';
                characterArray[newLength-3] = '%';
                newLength -= 3;
            } else {
                characterArray[newLength - 1] = characterArray[i];
                newLength--;
            }
        }
        return new String(characterArray);
    }
    public static void main(String[] args){
        String testString = "Snehangshu Chakraborty  ";
        String newString = fillWhiteSpace(testString, 22);
        System.out.println(newString+", length of old string = "+testString.length()
                +" Length of new string = "+ newString.length());
    }
}
