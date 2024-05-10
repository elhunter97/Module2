package sum_of_main_diagonal;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do{
            System.out.println("Enter number of row and column of the matrix: ");
            size = sc.nextInt();
        }while(size<=0);
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }

        System.out.println("Sum of main diagonal is: " + sum);

    }
}
