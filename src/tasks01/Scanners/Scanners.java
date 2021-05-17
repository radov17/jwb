package tasks01.Scanners;

import java.util.Scanner;

public class Scanners {

    public static int intScanner() {
        Scanner intScanner = new Scanner(System.in);
        return intScanner.nextInt();
    }

    public static double doubleScanner(){
        Scanner doubleScanner = new Scanner(System.in);
        return doubleScanner.nextDouble();
    }
}
