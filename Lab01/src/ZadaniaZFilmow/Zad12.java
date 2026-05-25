package ZadaniaZFilmow;
//Pętle while do - while w Javie
public class Zad12 {
    public static void main(String[] args) {
        int[] numbers = {10,11,12,13,14,15};
        int numbersLength = numbers.length;
        int index = 6;

//        while (index < numbersLength){
//            System.out.println(numbers[index]);
//            index++;
//        }

        do{
            System.out.println(numbers[index]);
            index++;
        }while (index < numbersLength);

    }
}
