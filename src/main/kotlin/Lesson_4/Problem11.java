package Lesson_4;

import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N natural sonini kiriting: ");
        int N = scanner.nextInt();

        int extremal = findExtremal(N);

        System.out.println("Ekstremal tartib raqami: " + extremal);
    }

    public static int findExtremal(int N) {
        if (N == 1) {
            return 1;
        } else if (N % 2 == 0) {
            return findExtremal(N / 2);
        } else {
            return findExtremal(N - 1) + 1;
        }
    }
}
