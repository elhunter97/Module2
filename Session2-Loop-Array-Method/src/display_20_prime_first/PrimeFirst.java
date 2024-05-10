package display_20_prime_first;

import java.util.Scanner;

public class PrimeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cntNumber;
        int cnt = 0;
        int number = 2;
        System.out.print("Enter number\n");
        cntNumber = sc.nextInt();
        while(cnt<cntNumber){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if(number % i ==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(number+" ");
                cnt++;
            }
            number++;
        }
    }
}
