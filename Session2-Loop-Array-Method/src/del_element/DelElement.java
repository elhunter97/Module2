package del_element;

import java.util.Scanner;

public class DelElement {
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
        System.out.println("Enter number you want to delete");
        int delElement = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == delElement) {
                for (int j = i; j <n-1 ; j++) {
                    arr[j] = arr[j+1];
                }
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }



    }


}
