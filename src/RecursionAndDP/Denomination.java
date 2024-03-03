package RecursionAndDP;

public class Denomination {

    public static void main(String args[]){
        int[] denom = {1,5, 10, 25};
        int n = 30;
        countDenomination(denom, n);
    }

    private static void countDenomination(int[] denom, int n) {

        int[] ways = new int[n+1];
        ways[0] = 1;

        for(int coins: denom){
            for(int i = 1; i <= n; i++){
                if(coins <= i){
                    ways[i] += ways[i-coins];
                }
            }
        }

        System.out.println("number of ways "+ways[n]);
    }
}
