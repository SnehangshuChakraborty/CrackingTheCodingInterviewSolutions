package RecursionAndDP;

import java.util.Arrays;

public class TripleStep {

    public static void main(String args[]){
        int result = countSteps(37);
        int optimisedResult = countStepsOptimal(37);
        System.out.println("Number of steps is "+ result);
        System.out.println("Number of steps is (Optimised) "+ optimisedResult);
    }

    //Brute Force
    public static int countSteps(int n){

        if(n < 0) return 0;
        if(n == 0) return 1;
        return countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
    }

    //optimal solution
    public static int countStepsOptimal(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return countWays(n, dp);
    }

    public static int countWays(int n, int[] dp){
        if(n < 0) return 0;
        if(n == 0) return 1;
        if(dp[n] > -1) return dp[n];
        dp[n] = countWays(n-1, dp)+countWays(n-2, dp)+countWays(n-3, dp);
        return dp[n];

    }
}
