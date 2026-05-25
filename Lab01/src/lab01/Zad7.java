package lab01;

import java.util.Scanner;

public class Zad7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj temperature w stopniach Celsjusza: ");

        double celsjusz = input.nextDouble();
        double fahrenheit = celsjusz * 1.8 + 32;

        System.out.printf("%.1f\u00B0C to w przeliczeniu %.1f\u00B0F\n", celsjusz, fahrenheit);

        input.close();
    }
}