package array_2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        System.out.println("Size of array");
        row = sc.nextInt();
        col =  sc.nextInt();
        // khoi tao mang 2 chieu
        int[][] matrix = new int[row][col];
        // nhap gia tri cho mang
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // in mang
        System.out.println("Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        // tinh tong tat ca phan tu trong mang
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum+= matrix[i][j];
            }
        }
        System.out.println("Sum = "+sum);

        // tinh tong tung cot;
        int sumCol;
        for (int i = 0; i < row; i++) {
            sumCol = 0;
            for (int j = 0; j < col; j++) {
                sumCol+=matrix[i][j];
            }
            System.out.println("Collum "+(i+1)+" sum = "+sumCol);
        }

        // tim dong co tong lon nhat
        int sumRowMax = 0;
        int sumThisRow;
        int indexMaxRow = 0;
        for (int i = 0; i < matrix[0].length ; i++) {
            sumRowMax+=matrix[0][i];
        }

        for (int i = 1; i < row; i++) {
            sumThisRow = 0;
            for (int j = 0; j <col; j++) {
                sumThisRow+=matrix[i][j];

                if(sumThisRow>sumRowMax){
                    sumRowMax = sumThisRow;
                    indexMaxRow = i;
                }
            }
        }
        System.out.println("Row "+indexMaxRow+" have max sum is "+sumRowMax);


    }
}
