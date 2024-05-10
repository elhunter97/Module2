package check_prime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println(n+" is prime");
        } else {
            System.out.println(n+" is not prime");
        }

    }

    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
