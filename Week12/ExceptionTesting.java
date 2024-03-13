public class ExceptionTesting {
    public void Minus(int a, int b) throws ExceptionA, ExceptionB {
        if(a == 0){
            throw new ExceptionB("Parameter a is zero.");
        }
        if(b == 0){
            throw new ExceptionB("Parameter b is zero.");
        }
        if(a < 0 || b < 0){
            throw new ExceptionB();
        }

        int result = a - b;

        if(result < 0){
            throw new ExceptionA("Result is negative: " + result, 2);
        }
        else if(result == 0){
            throw new ExceptionA("Result is zero: " + result, 1);
        }
    }

    public static void main(String args[]){
        try {
            ExceptionTesting exp1 = new ExceptionTesting();
            exp1.Minus(1, 3);
        } catch(ExceptionA ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionB ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }

        System.out.println("-----");

        try {
            ExceptionTesting exp2 = new ExceptionTesting();
            exp2.Minus(1, 0);
        } catch(ExceptionA ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionB ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }

        System.out.println("-----");

        try {
            ExceptionTesting exp3 = new ExceptionTesting();
            exp3.Minus(6, -99);
        } catch(ExceptionA ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionB ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }
    }
}