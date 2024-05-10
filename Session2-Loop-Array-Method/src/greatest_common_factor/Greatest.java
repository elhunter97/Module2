package greatest_common_factor;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int uSCLN = 1 ;
        if (a == 0 || b == 0) {
            uSCLN = a + b;
        }else{
            while(a!=b){
                if(a>b){
                    a = a-b;
                }else{
                    b = b-a;
                }
            }
            uSCLN = a;
            System.out.printf("uSCLN = %d", uSCLN);
        }
    }
}
