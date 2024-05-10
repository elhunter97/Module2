package reverse_array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr;
        do{
            System.out.println("Enter size of array");
            n = sc.nextInt();
        }while(n<0 || n>100);
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element "+i+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before reverse ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < n/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.print("Array after reverse ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
