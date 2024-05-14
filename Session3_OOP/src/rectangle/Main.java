package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your rectangle\n"+rectangle.display());
        System.out.println("Perimeter = "+rectangle.getPerimeter());
        System.out.printf("Area = %.2f",rectangle.getArea());
    }
}
