package lab01;

import java.util.Scanner;

public class Zad8 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj długosc pierwszej przyprostokatnej (a): ");
        double a = input.nextDouble();

        System.out.print("Podaj długosc drugiej przyprostokatnej (b): ");
        double b = input.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("Długosc przeciwprostokatnej wynosi: %.3f\n", c);

        input.close();
    }
}