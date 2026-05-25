package ZadaniaZFilmow;
//Różnice między equals(), a ==  String pool & Integer pool
public class Zad6 {
    public static void main(String[] args) {
        //int a = 3;
        //System.out.println("A: " + a);

       // int b = 3;
        //System.out.println("B: " + b);

       // System.out.println("a == b: " + (a == b));

//        Integer aVar = 127;
//        System.out.println("A: " + aVar);
//
//        Integer bVar = 127;
//        System.out.println("B: " + bVar);
//
//        Integer cVar = 127;
//        System.out.println("C: " + cVar);
//        Integer dVar = Integer.valueOf(127);
//        System.out.println("D: " + dVar);
//
//        System.out.println("A == C: " + (aVar == cVar));

        String s1 = "Cat";
        System.out.println("s1: " + s1);

        String s2 = "Cat";
        System.out.println("s2: " + s2);
        String s3 = new String("Cat");
        System.out.println("s3: " + s3);
        System.out.println("s1 == s3: " + (s1.equals(s3)));

    }

}
