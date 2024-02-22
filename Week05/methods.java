class Method2{
    static int multi(int a, int b){
        return a * b;
    }
}

class Method3{
    int fact(int a){
        if(a == 1)
            return 1;
        else
            return a * fact(a-1);
    }
}

public class methods{
    static int add(int a, int b){
        return a + b;
    }

    public static void main(String args[]){
        System.out.println(add(3, 4));                   // add method is already declared in main, there is no need to write Method.add(a, b)
        System.out.println(methods.add(3, 4));           // same output as above
        System.out.println(Method2.multi(4, 5));
        Method3 x = new Method3();                           // Method3 is not static, create an object first to use it
        System.out.println(x.fact(5));
    }
}