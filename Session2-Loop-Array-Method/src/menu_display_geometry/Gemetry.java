package menu_display_geometry;

import java.util.Scanner;

public class Gemetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Your choice");
        System.out.println("1-Print the rectangle");
        System.out.println("2-Print the square triangle");
        System.out.println("3-Print the circle");
        System.out.println("4-Exit");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the length");
                int length = sc.nextInt();
                System.out.println("Enter the width");
                int width = sc.nextInt();
                for (int i = 1; i <= length; i++) {
                    for (int j = 1; j <=width ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                case 2:
                    System.out.println("Enter the egle square");
                    int edge = sc.nextInt();
                    System.out.println("Choose 1-bottom-left or 2-top-left");
                    int choose = sc.nextInt();
                    if (choose == 1) {
                        for (int i = 1; i <= edge; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else if (choose == 2) {
                        for (int i = edge; i >= 1; i--) {
                            for (int j = 1; j <= i ; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 3:
                        System.out.println("Enter the length");
                        int n = sc.nextInt();
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n+i-1 ; j++) {
                                if(j<=n-i){
                                    System.out.print(" ");
                                } else{
                                    System.out.print("*");
                                }
                            }
                            System.out.println();
                        }
                        break;
            default:
                System.out.println("Exit");
                break;
        }
    }
}
