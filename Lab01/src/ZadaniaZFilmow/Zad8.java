package ZadaniaZFilmow;
import java.util.Scanner;
//Pierwsze, proste programy w Javie
public class Zad8 {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
//        System.out.println("Podaj dlugosc boku kwadratu aby wyliczyc jego obwod: ");
        Scanner sc = new Scanner(System.in);
//        int sideLength = sc.nextInt();
//        System.out.println("Obwod kwadratu to: " + (4* sideLength));

//        System.out.println("Podaj dlugosc boku A prostokata: ");
//        int sideLengthA = sc.nextInt();
//        System.out.println("Podaj dlugosc boku B prostokata: ");
//        int sideLengthB = sc.nextInt();
//        System.out.println("Obwod prostokata to: " + (2* sideLengthA + 2 * sideLengthB));

//        System.out.println("Podaj dlugosc boku A prostokata: ");
//        int sideLengthA = sc.nextInt();
//        System.out.println("Podaj dlugosc boku B prostokata: ");
//        int sideLengthB = sc.nextInt();
//        System.out.println("Pole prostokata to: " + (sideLengthA * sideLengthB));

        System.out.println("Podaj dlugosc boku A prostokata: ");
        int sideLengthA = sc.nextInt();
        System.out.println("Podaj dlugosc boku B prostokata: ");
        int sideLengthB = sc.nextInt();
        System.out.println("Czy A == B? : "  + (sideLengthA == sideLengthB));


    }
}
