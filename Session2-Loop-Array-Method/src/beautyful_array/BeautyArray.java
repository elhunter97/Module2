package beautyful_array;

import java.util.Scanner;

public class BeautyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();
        }while (n<=0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int leftSum;
        int rightSum;

        // sử dụng vòng lặp for
        for (int i = 1; i < n; i++) {
             leftSum = 0;
             rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum+= arr[j];
            }

            for (int j = i+1; j < n; j++) {
                rightSum+=arr[j];
            }

            if(leftSum == rightSum) {
                System.out.println("This array is beautiful");
                break;
            }
        }

        //sử dụng vòng lặp while
                /*int i = 1;
                int j;
                int k;
                while(i<n){
                    leftSum = 0;
                    rightSum = 0;
                    j=0;
                    while(j<i){
                        leftSum+= arr[j];
                        j++;
                    }
                    k = i+1;
                    while(k<n){
                        rightSum+=arr[k];
                        k++;
                    }
                     if(leftSum==rightSum){
                         System.out.println("This array is beautiful");
                         break;
                     }
                     i++;
                }*/
        // sử dụng do While
        /*int i = 1;
        do{
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum+= arr[j];
            }

            for (int j = i+1; j < n; j++) {
                rightSum+=arr[j];
            }

            if(leftSum == rightSum) {
                System.out.println("This array is beautiful");
                break;
            }
            i++;
        }while(i<n);*/
    }
}
