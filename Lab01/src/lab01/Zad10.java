package lab01;

import java.io.File;//plik
import java.io.IOException;//wyjątki
import java.util.Scanner;

public class Zad10 {
    public static void main(String args[]) throws IOException {

        File f=new File("src/lab01/dane.txt");
        Scanner input=new Scanner(f);

        while (input.hasNext()) {
            String imie = input.next();
            String nazwisko = input.next();
            int godziny = input.nextInt();
            double stawka = input.nextDouble();

            System.out.printf("%s %s - %.2f\n", imie, nazwisko, godziny * stawka);
        }
        input.close();
    }
}