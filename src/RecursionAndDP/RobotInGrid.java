package RecursionAndDP;

import java.util.Arrays;

public class RobotInGrid {

    public static void main(String args[]){
        int[][] grid = {{0,0,0,0},
                        {0,1,1,0},
                        {0,1,1,0},
                        {1,0,0,0}};
        int result = countUniquePaths(grid);
        int optimalResult = countUniquePathsOptimally(grid);
        System.out.println("Unique path to the end is "+ result);
        System.out.println("Unique path to the end (optimally) is "+ optimalResult);
    }

    //Brute Force
    public static int countUniquePaths(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        return countHelper(0,0,row,col,grid);
    }

    public static int countHelper(int currentRow, int currentCol, int row, int col, int[][] grid){
        if(row == currentRow || col == currentCol) return 0;

        if(grid[currentRow][currentCol] == 1) return 0;

        if(currentRow == row-1 && currentCol == col-1) return 1;

        return countHelper(currentRow+1,currentCol, row,col,grid)
                +countHelper(currentRow, currentCol+1, row, col, grid);
    }

    // Optimal solution
    public static int countUniquePathsOptimally(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;

        int[][] dp = new int[row][col];

        for(int[] thisRow: dp){
            Arrays.fill(thisRow,-1);
        }

        return countHelperOptimal(0,0,row,col,grid, dp);
    }

    public static int countHelperOptimal(int currentRow, int currentCol, int row, int col, int[][] grid, int[][] dp){

        if(currentCol == col || currentRow == row) {
            return 0;
        } else if(grid[currentRow][currentCol] == 1){
            return 0;
        } else if(currentRow == row-1 && currentCol == col-1){
            return 1;
        } else if(dp[currentRow][currentCol] > -1) {
            return dp[currentRow][currentCol];
        } else {
            return dp[currentRow][currentCol] = countHelperOptimal(currentRow+1, currentCol, row, col, grid, dp)
                    + countHelperOptimal(currentRow, currentCol+1, row, col, grid, dp);
        }
    }
}
