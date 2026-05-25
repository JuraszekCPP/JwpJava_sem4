package ZadaniaZFilmow;

import java.util.Scanner;

//instrukcje warunkowe if - else if - else
public class Zad9 {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.println("Wybierz wzór: ");
        System.out.println("1) Obwod kwadratu: ");
        System.out.println("2) Obwod prostokata: ");
        System.out.println("3) Pole prostokata: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1) {
            System.out.println("Podaj dlugosc boku kwadratu aby wyliczyc jego obwod: ");
            int sideLength = sc.nextInt();
            System.out.println("Obwod kwadratu to: " + (4 * sideLength));
        } else if(option == 2) {

            System.out.println("Podaj dlugosc boku A prostokata: ");
            int sideLengthA = sc.nextInt();
            System.out.println("Podaj dlugosc boku B prostokata: ");
            int sideLengthB = sc.nextInt();
            System.out.println("Obwod prostokata to: " + (2 * sideLengthA + 2 * sideLengthB));
        } else if (option == 3) {
            System.out.println("Podaj dlugosc boku A prostokata: ");
            int sideLengthAA = sc.nextInt();
            System.out.println("Podaj dlugosc boku B prostokata: ");
            int sideLengthBB = sc.nextInt();
            System.out.println("Pole prostokata to: " + (sideLengthAA * sideLengthBB));
        } else {
            System.out.println("brak takiej opcji");
        }

        if(option == 5){
            System.out.println("Podales wartosc 5");
        }else{
            System.out.println("Podales wartosc inna niz 5");
        }
        System.out.println("KONIEC!");





    }
}
