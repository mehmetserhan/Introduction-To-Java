public class castingAndLogicalExp{
    public static void main(String args[]){
        /*  btye - short - int - long - float - double
         *  double to btye is widening type casting (known as downcasting) -> no loss
         *  byte to double is narrowing type casting (known as upcasting) -> loss
        */

        double a = 1.7;
        int b = (int)a;
        System.out.println("a: " + a + ",  b: " + b);

        int x = 5;
        int z = 3;
        double y = (double)x;
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        int k = x | z;
        int m = x & z;
        System.out.println("3|5 : " + k + " | " + "3&5 : " + m);

        int x1 = ++x;
        int z1 = z++;
        int x2 = x--;
        int z2 = --z;

        System.out.println("++x : " + x1);
        System.out.println("z++ : " + z1);
        System.out.println("x-- : " + x2);
        System.out.println("--z : " + z2);
        System.out.println("latest value of x : " + x);
        System.out.println("latest value of z : " + z);

        int logicalExp1 = (5>3)? 5 : 3;
        System.out.println("1. expression: " + logicalExp1);

        Boolean logicalExp2 = (4<2)? true : false;
        System.out.println("2. expression: " + logicalExp2);
    }
}