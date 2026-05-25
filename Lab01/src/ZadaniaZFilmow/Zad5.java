package ZadaniaZFilmow;
// STOS vs STERTA. Zmienne referencyjne

public class Zad5 {

    public static void main(String[] args) {
        byte byteVar = 1;
        System.out.println("byte: " + byteVar);

        short shortVar = 2;
        System.out.println("short: " + shortVar);

        int intVar = 3;
        Integer intVarWrapper = 5;
        intVarWrapper.toString();
        System.out.println(Integer.parseInt("3555"));
        System.out.println("int: " + intVar);

        long longVar = 400000000000L;
        System.out.println("long: " + longVar);

        float floatVar = 400.12F;
        System.out.println("float: " + floatVar);

        double doubleVar = 400.13;
        System.out.println("double: " + doubleVar);

        char charVar = 125;
        System.out.println("char: " + charVar);

        boolean booleanVar = false;
        System.out.println("boolean: " + booleanVar);

        var varVariable = 123;
        System.out.println("var: " + varVariable);

    }
}
