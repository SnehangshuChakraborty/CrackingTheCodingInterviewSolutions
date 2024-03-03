package RecursionAndDP;

public class PaintFill {
    public static void main(String args[]){
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        numberOfIslands(grid);
    }

    public static void numberOfIslands(char[][] grid){
        int counter = 0;

        for (int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] =='1'){
                    counter++;
                    callBFS(grid, i, j);
                }
            }
        }
        System.out.print("Number of Islands "+counter);
    }

    public static void callBFS(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row > grid.length-1 || col > grid[0].length-1 || grid[row][col] == '0') return;

        grid[row][col] = '0';
        callBFS(grid, row+1, col);
        callBFS(grid, row-1, col);
        callBFS(grid, row, col+1);
        callBFS(grid, row, col-1);
    }
}
