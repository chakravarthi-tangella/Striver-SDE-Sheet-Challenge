package _2.pascalsTriangle;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(printPascal(5));
    }

    public static ArrayList<Long> generateRow(int row)
    {
        Long ans = 1L;

        ArrayList<Long> ansRow = new ArrayList<>();
        ansRow.add(1L);
        for (int col = 1; col < row; col++) {
            ans = ans * (row -col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {

        ArrayList<ArrayList<Long>> pascalTriangle = new ArrayList<ArrayList<Long>>(n);

        for (int i = 1; i <= n; i++) {
            pascalTriangle.add(generateRow(i));
        }

        return pascalTriangle;

    }
}
