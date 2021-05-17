package tasks01.Task5;

import tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task5 {
    private static int readingNumber() {
        while (true) {
            try {
                System.out.println("Введите целое число:");
                int a = Scanners.intScanner();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Некорректное значение.");
            }
        }
    }

    private static boolean isPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        return sum == a;
    }



    public static void main(String[] args) {
        int validNumber = readingNumber();
        System.out.println(isPerfectNumber(validNumber));
    }
}
