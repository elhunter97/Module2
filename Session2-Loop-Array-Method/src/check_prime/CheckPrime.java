package check_prime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if(n<2){
            System.out.println(n+" is not a prime number");
        } else{
            boolean check = true;
            i = 2;
            while(i<=Math.sqrt(n)){
                if(n%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(n+" is a prime number");
            } else {
                System.out.printf(n+" is not a prime number");
            }
        }
    }
}
