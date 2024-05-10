package prime_smaller_than_100;

public class PrimeSmaller100 {
    public static void main(String[] args) {
        int number = 2;
        while(number<100){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(number+" ");
            }
            number++;
        }

    }
}
