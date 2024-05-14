package quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if(q.getDiscriminant()>0){
            System.out.printf("\nPT co 2 nghiem x1 = %.2f x2 = %.2f",q.getRoot1(),q.getRoot2());
        } else if (q.getDiscriminant() == 0){
            System.out.printf("\nPT co nghiem kep x1=x2= %.2f",-b/(2*a));
        } else {
            System.out.print("PT vo nghiem");
        }
    }
}
