class Method1{
    static int multi(int a, int b){
        return a * b;
    }
}

class Method2{
    int fact(int a){
        if(a == 1)
            return 1;
        else
            return a * fact(a-1);
    }
}

public class Methods{
    static int add(int a, int b){
        return a + b;
    }

    public static void main(String args[]){
        System.out.println(add(3, 4));                   // add method is already declared in main, there is no need to write Methods.add(a, b)
        System.out.println(Methods.add(3, 4));           // same output as above
        
        System.out.println(Method1.multi(4, 5));
        
        Method2 x = new Method2();                           // Method2 is not static. To use it, create an object first 
        System.out.println(x.fact(5));
    }
}