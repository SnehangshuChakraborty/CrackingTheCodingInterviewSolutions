package ArraysAndString;

public class RotateMatrix {

    public static void main(String[] args){

        int[][] array = {{ 1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int[][] newArray = rotateMatrixByNinetyDegree(array);
        for(int i = 0; i<newArray.length; i++){
            for(int j = 0; j<newArray[i].length; j++){
                System.out.print(" "+newArray[i][j]);
            }
            System.out.print("\n");
        }
    }

    private static int[][] rotateMatrixByNinetyDegree(int[][] matrix) {

        int rows = matrix.length; //2
        int column = matrix[0].length; //2

        for(int i = 0; i<rows; i++){
            for(int j = i; j < column; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i =0 ; i<rows; i++){
            for(int j = 0; j<rows/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        return matrix;
    }
}
