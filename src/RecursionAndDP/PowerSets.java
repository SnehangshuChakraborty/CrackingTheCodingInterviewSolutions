package RecursionAndDP;

public class PowerSets {

    public static void main(String args[]){
        char[] array = {'a','b','c','d'};
        computePowerSet(array, array.length);
    }

    public static void computePowerSet(char[] array, int size){
        long tableSize = (long) Math.pow(2,size);
        int counter, j;
        int res = 0;
        for(counter = 0; counter < tableSize; counter++){
            for(j = size-1; j >= 0; j--){
                if((counter & (1<<j)) > 0){
                    System.out.print(array[j]);
                }
            }
            res+=1;
            System.out.println();
        }
        System.out.println(res);
    }
}
