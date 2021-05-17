
/*Написать программу, позволяющую по последней цифре числа определить последнюю цифру его
квадрата.
 */

package tasks01.task1;

import tasks01.Scanners.Scanners;

import java.util.InputMismatchException;

public class Task1 {
    private static int lastDigit(int a){
        return a % 10;
    }

    private static int lastDigitOfSquare(int b){
        return (int) (Math.pow(b, 2) % 10);
    }

     public static void main(String[] args) {
         while (true) {
             System.out.println("Введите целое число: ");
             try {
                 int a = Scanners.intScanner();
                 System.out.println("Последняя цифра квадрата числа: " + lastDigitOfSquare(lastDigit(a)));
             } catch (InputMismatchException e) {
                 System.out.println("Некорректное значение.");
             }
         }
     }
}
