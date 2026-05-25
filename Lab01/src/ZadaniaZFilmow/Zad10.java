package ZadaniaZFilmow;

import java.util.Scanner;

//Instrukcje switch ... case
public class Zad10 {
    public static void main(String[] args) {
        System.out.println("WZORY MATEMATYCZNE");
        System.out.println("Wybierz wzór: ");
        System.out.println("1) Obwod kwadratu: ");
        System.out.println("2) Obwod prostokata: ");
        System.out.println("3) Pole prostokata: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        String chostenOption = switch(option) {
            case 1,6 -> {
                System.out.println("Podaj dlugosc boku kwadratu aby wyliczyc jego obwod: ");
                int sideLength = sc.nextInt();
                System.out.println("Obwod kwadratu to: " + (4 * sideLength));
                yield "Wybrales opcje: " + option;
            }
            case 2 -> {
                System.out.println("Podaj dlugosc boku A prostokata: ");
                int sideLengthA = sc.nextInt();
                System.out.println("Podaj dlugosc boku B prostokata: ");
                int sideLengthB = sc.nextInt();
                System.out.println("Obwod prostokata to: " + (2 * sideLengthA + 2 * sideLengthB));
                yield "Wybrales opcje: " + option;
            }
            case 3 -> {
                System.out.println("Podaj dlugosc boku A prostokata: ");
                int sideLengthAA = sc.nextInt();
                System.out.println("Podaj dlugosc boku B prostokata: ");
                int sideLengthBB = sc.nextInt();
                System.out.println("Pole prostokata to: " + (sideLengthAA * sideLengthBB));
                yield "Wybrales opcje: " + option;
            }
            default ->
                    {
                System.out.println("brak takiej opcji");
                        yield "Brak opcji!";
                    }


        };

        System.out.println(chostenOption);




    }

}
