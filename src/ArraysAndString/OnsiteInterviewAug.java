package ArraysAndString;

public class OnsiteInterviewAug {

    public static void main(String[] args){
        String[] testArray = {"5C", "6C", "7C", "8C"};
        isValidSet(testArray);
    }

    private static void isValidSet(String[] testArray) {

        for (int i = 0; i < testArray.length-1; i++){
            String firstElement = testArray[i];
            int num = Integer.parseInt(firstElement.replaceAll("[^0-9]", ""));
            char alphabet = firstElement.charAt(1);

            String secondElement = testArray[i+1];
            int secondNum = Integer.parseInt(secondElement.replaceAll("[^0-9]", ""));
            char nextAlphabet = secondElement.charAt(1);

            if(num != secondNum){
                if(alphabet == nextAlphabet && Math.abs(secondNum-num) == 1){
                    continue;
                } else {
                    System.out.println("Not a valid set");
                    return;
                }
            } else continue;

        }
        System.out.println("It is a valid set");
    }
}
