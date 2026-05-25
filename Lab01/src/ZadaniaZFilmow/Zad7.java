package ZadaniaZFilmow;
//Operatory arytmetyczne, przypisania i porównania
public class Zad7 {
    public static void main(String[] args) {
        //dwuagumentowe

        int i1 = 30;
        int i2 = 10;
        int i3 = 4;
        int i4 = 3;

        System.out.println("i1 + i2 = " + (i1+i2));
        System.out.println("i1 - i2 = " + (i1-i2));
        System.out.println("i1 / i2 = " + (i1/i2));
        System.out.println("i3 % i4 = " + (i3%i4));
        System.out.println("i3 * i4 = " + (i3*i4));
        System.out.println();
        System.out.println("Hello" + "World" + "!");
        System.out.println("-------------------------");

        //jednoargumentowe

        int i5 = 10;
        int i6 = -10;

        System.out.println("i5 = " + i5);

        System.out.println("i5++ = " + i5++);
        System.out.println("i5 = " + i5);

        System.out.println("++i5 = " + ++i5);
        System.out.println("i5 = " + i5);
        System.out.println();
        System.out.println("i6 = " + i6);

        System.out.println("i6-- = " + i6--);
        System.out.println("i6 = " + i6);

        System.out.println("--i6 = " + --i6);
        System.out.println("i6 = " + i6);
        System.out.println("-----------------------");

        //przypisania

        int i7 = 10;
        int i8 = 10;

        i7 += 5;
        i8 -= 5;

        System.out.println("i7 = " + i7);
        System.out.println("i8 = " + i8);
        System.out.println("-----------------------");

        //operatory relacyjne

        int i9 = 10;
        int i10 = 20;

        System.out.println("i8 == i9 = " + (i9 == i10));
        System.out.println("i8 != i9 = " + (i9 != i10));
        System.out.println("i8 > i9 = " + (i9 > i10));
        System.out.println("i8 < i9 = " + (i9 < i10));
        System.out.println("i8 >= i9 = " + (i9 >= i10));
        System.out.println("i8 <= i9 = " + (i9 <= i10));
        System.out.println("-----------------------");







    }
}
