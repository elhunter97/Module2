package interest_calculator;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month=1;
        float interestRate;
        double moneySend=1.0;
        double totalInterest = 0;
        System.out.println("Enter month income");
        month = sc.nextInt();
        System.out.println("Enter interest rate");
        interestRate = sc.nextFloat();
        System.out.println("Enter money send");
        moneySend = sc.nextFloat();
        for (int i = 0; i < month; i++) {
            totalInterest+= moneySend*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest is: " + totalInterest+"đ");
    }
}
