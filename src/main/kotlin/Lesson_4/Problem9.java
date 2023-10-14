package Lesson_4;

import java.util.Scanner;

public class Problem9 {
    //    public static double y(double a, double b, double c, double x) {
//
//        if (a > b * b) {
//            double n = a * a + 4 * a * b * c + c * c;
//            double d = a - b * b;
//            return n / d;
//
//        } else if (x != 0) {
//            double n = Math.pow((2 * a / c * c), 1 / 3) + Math.pow(((c * c) / (x * x)), 1 / 5);
//            return n;
//        } else {
//            return 0;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double x = sc.nextDouble();
//
//        double result = y(a, b, c, x);
//        System.out.printf("%.4f", result);
//    }
//}
//
//public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Massiv o'lchamini kiriting : ");
        n = sc.nextInt();
        int[] numbers = new int[n + 1];

        System.out.println("Massiv elementlarini kiriting: ");
        for (int i = 0; i < n; i++) {

            numbers[i] = sc.nextInt();
        }

        int ozgarishlarSoni = 0;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i + 1] > 0 && (numbers[i] < 0) && numbers[i] % 10 != 0) {
                ozgarishlarSoni++;
            } else if (numbers[i + 1] < 0 && (numbers[i] > 0) && numbers[i] % 10 != 0) {
                ozgarishlarSoni++;
            }

        }
        System.out.println("Ketma ketlikda ishora o'zgarishlar soni: " + ozgarishlarSoni);
    }
}


// nol bilan tugaydigan va noldan farqli butun sonlar ketma ketligidan ishora o'zgarishlar soni aniqlansin. ( Masalan: 1, -34, 8, 4, -5,  0 ketma ketlikda ishora 3 marta o'zgaradi)