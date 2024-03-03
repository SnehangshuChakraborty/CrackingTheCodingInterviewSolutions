package ArraysAndString;

public class  ReturnIndex {

    public static void main(String args[]){
        int[] array = {10,9,8,7,6,4};
        sortIndex(array);
    }

    private static void sortIndex(int[] array) {
        int[] result = new int[array.length];

        for(int i = 0; i< result.length; i++){
            result[i] = i;
        }


        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if(array[result[i]] < array[result[j]]){
                   int temp = result[i];
                   result[i] = result[j];
                   result[j] = temp;
                }
            }
        }

        for(int i = 0; i< result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
