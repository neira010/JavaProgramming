package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b =  a;






        long j = 1000000;
        short k = (short) j;
        System.out.println(j+ " : "+k);



        double l = 2.5;
        float m = (float)l;
        System.out.println(l + " : "+ m);

        double n = 10.8;
        int s = (int)n;
        System.out.println(n + " : "+s);


        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : "+ s1);

        float f1 = 30.5f;
        long l1 = (long) f1;
        System.out.println(f1 + " : "+ l1);
    }



}
