package ArraysAndString;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String inputString){

        int[] decimalASCITable = new int[128];
        int count = 0;

        for (int i = 0; i< inputString.length(); i++){
            decimalASCITable[inputString.charAt(i)]++;
        }

        for (int index = 0; index < 128; index++){
            count += decimalASCITable[index]%2;
        }

        return count <=1;
    }

    public static void main(String[] args){
        String testString = "Tact coa";
        boolean result = isPalindromePermutation(testString);
        System.out.println(result);
    }
}
