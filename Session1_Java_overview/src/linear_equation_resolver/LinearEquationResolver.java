package linear_equation_resolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        System.out.println("Enter a");
        a = sc.nextFloat();
        float b;
        System.out.println("Enter b");
        b = sc.nextFloat();
        float c;
        System.out.println("Enter c");
        c = sc.nextFloat();

        if(a!=0){
            System.out.printf("X= %.2f",(c-b)/a);
        } else{
            if(b==c){
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        }

    }
}
