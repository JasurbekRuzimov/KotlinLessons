package Lesson_4;

import java.util.Scanner;

public class Problem10{
    public static double y(double a, double b, double c, double x) {

        if (a > b * b) {
            double n = a * a + 4 * a * b * c + c * c;
            double d = a - b * b;
            return n / d;

        } else if (x != 0) {
            double n = Math.pow((2 * a / c * c), 1 / 3) + Math.pow(((c * c) / (x * x)), 1 / 5);
            return n;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x = sc.nextDouble();

        double result = y(a, b, c, x);
        System.out.printf("%.4f", result);
    }
}


