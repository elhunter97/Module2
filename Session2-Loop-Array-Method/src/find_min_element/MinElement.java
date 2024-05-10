package find_min_element;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter size of array");
            n = sc.nextInt();
        }while(n<=0);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int min = arr[Min(arr)];
        System.out.println("Minimum element is " + min);
    }

    public static int Min(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }
}
