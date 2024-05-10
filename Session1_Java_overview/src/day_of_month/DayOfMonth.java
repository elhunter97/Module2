package day_of_month;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int year;
        System.out.println("Enter year");
        year = sc.nextInt();
        System.out.println("Which month you want count day?");
        month = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Month "+month+" have 31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Month "+month+" have 30 days");
                break;
            case 2:
                if(year%4==0){
                    if(year%100==0){
                        if(year%400==0){
                            System.out.println("Month "+month+" have 29 days");
                        } else {
                            System.out.println("Month "+month+" have 28 days");
                        }
                    } else {
                        System.out.println("Month "+month+" have 29 days");
                    }
                } else{
                    System.out.println("Month "+month+" have 28 days");
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
