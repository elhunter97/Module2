package add_element;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[10];

        System.out.println("Enter number you want to add");
        int addElement = sc.nextInt();
        System.out.println("At index:" );
        int idx = sc.nextInt();
        for (int i = 9; i > idx; i--) {
            arr[i] = arr[i-1];
        }
        arr[idx] = addElement;

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
