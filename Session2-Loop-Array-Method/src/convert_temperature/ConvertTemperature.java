package convert_temperature;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Convert Celsius to Fahrenheit");
        System.out.println("2- Convert Fahrenheit to Celsius");
        System.out.println("0-Exit");
        System.out.println("-----Your choice-----");
        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Celsius : ");
                double celsius = sc.nextDouble();
                System.out.println(celsius+" C = "+ctoF(celsius)+" F");
                break;
            case 2:
                System.out.println("Enter Fahrenheit : ");
                double fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit+" F = "+ftoC(fahrenheit)+" C");
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }

    public static double ftoC(double f) {
        double c = (5.0/9)*(f-32);
        return c;
    }

    public static double ctoF(double c) {
        double f = 9*c/5.0+32;
        return f;
    }


}
