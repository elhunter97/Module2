package sum_of_column_array_2D;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        System.out.println("Size of array");
        row = sc.nextInt();
        col = sc.nextInt();
        // khoi tao mang 2 chieu
        int[][] matrix = new int[row][col];
        // nhap gia tri cho mang
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: " );
                matrix[i][j] = sc.nextInt();
            }
        }
        // in mang
        System.out.println("Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int column;
        int sum = 0;
        do {
            System.out.printf("Enter number of column you want to sum: ");
            column = sc.nextInt();
        } while (column<0 || column>col);
        for (int i = 0; i < row; i++) {
            sum+=matrix[i][column];
        }
        System.out.println("Sum of column "+column+" is "+sum);
    }
}
