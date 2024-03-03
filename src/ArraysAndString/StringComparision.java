package ArraysAndString;

public class StringComparision {

    public static void main(String[] args){
        String testString = "aabcd";
        System.out.println(compressString(testString));
    }

    private static String compressString(String testString) { //aabcd

        char[] toCharArray = testString.toCharArray();
        int index =0;
        int elementStart = 0;

        while (elementStart < toCharArray.length){
            int elementEnd = elementStart;

            while (elementEnd < toCharArray.length && toCharArray[elementStart] == toCharArray[elementEnd]){
                elementEnd++; //2
            }

            toCharArray[index++] = toCharArray[elementStart];
            if (elementEnd - elementStart > 1){

                String rangeOfRepeatingChar = elementEnd - elementStart + "";

                for (char number:rangeOfRepeatingChar.toCharArray()){
                    toCharArray[index++] = number;
                }
            }

            elementStart = elementEnd;
        }

        return new String(toCharArray);
    }
}
