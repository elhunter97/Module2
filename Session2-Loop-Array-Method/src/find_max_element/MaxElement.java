package find_max_element;

import java.util.Scanner;

public class MaxElement {
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
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max element is " + max);

    }
}
