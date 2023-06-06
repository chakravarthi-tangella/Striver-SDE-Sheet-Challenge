package _1.SetMatrixZeros;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,0,6},{7,8,9}};
        matrix = setZeros(matrix);

        for (int[] arr :
                matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] setZeros(int matrix[][]) {
        int[] rowArr = new int[matrix.length];
        int[] colArr = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0)
                {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }

        for(int i=0; i<matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++) {
                if(rowArr[i] == 1 || colArr[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
