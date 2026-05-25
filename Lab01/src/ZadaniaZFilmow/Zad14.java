package ZadaniaZFilmow;
import java.util.Map;
import java.util.Scanner;
//Tablice dwuwymiarowe i macierze = pętle zagnieżdżone w Javie
public class Zad14 {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int[][] numbersMatrix = {
                {10, 11, 12},
                {13, 14},
                {15, 16, 17},
                {18}
        };


        System.out.println("Podaj ilość poziomów: ");
        Scanner scanner = new Scanner(System.in);
        int levelsCount = scanner.nextInt();

        for (int i = 0; i < levelsCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        for (int[] numbersRow : numbersMatrix) {
//            for (int number : numbersRow) {
//                System.out.print(number + " ");
//            }
//            System.out.println();
//        }

//        int sumGlobal = 0;
//
//        for (int i=0; i< numbersMatrix.length; i++){
//            int sum = 0;
//            for (int j=0; j< numbersMatrix[i].length; j++){
//
//               sum += numbersMatrix[i][j];
//            }
//            sumGlobal += sum;
//        }
//        System.out.println(sumGlobal);

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == 13) {
//                break;
//            }
//            System.out.println(numbers[i]);
//        }

//        System.out.println("Podaj dowolne słowo: ");
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.next();
//
//        for (char wordPart : word.toCharArray()) {
//            System.out.print(wordPart + " ");
//        }




        }



}
