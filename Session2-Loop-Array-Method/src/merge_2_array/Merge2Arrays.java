package merge_2_array;

import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter size of array 1");
            n = sc.nextInt();
        }while(n<=0);
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr1[i] = sc.nextInt();
        }
        int m;
        do{
            System.out.println("Enter size of array 2");
            m = sc.nextInt();
        }while(m<=0);
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Element " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        int[] arr3 = new int[n+m];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            arr3[arr3.length-n+i+1] = arr2[i];
        }
        System.out.println("Array 3: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
