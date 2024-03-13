public class ExceptionTesting2 {
    public void MyOperation(int a, int b) throws ExceptionB, ExceptionC {
        if(a == 0){
            throw new ExceptionC("Parameter a is zero.");
        }
        if(b == 0){
            throw new ExceptionC("Parameter b is zero.");
        }
        if(a < 0 || b < 0){
            throw new ExceptionC();
        }

        int result = a - b;

        if(result < 0){
            throw new ExceptionB("Result is negative: " + result, 2);
        }
        else if(result == 0){
            throw new ExceptionB("Result is zero: " + result, 1);
        }
    }

    public static void main(String args[]){
        try {
            ExceptionTesting2 exp1 = new ExceptionTesting2();
            exp1.MyOperation(1, 3);
        } catch(ExceptionB ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionC ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }

        System.out.println("-----");

        try {
            ExceptionTesting2 exp2 = new ExceptionTesting2();
            exp2.MyOperation(1, 0);
        } catch(ExceptionB ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionC ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }

        System.out.println("-----");

        try {
            ExceptionTesting2 exp3 = new ExceptionTesting2();
            exp3.MyOperation(6, -99);
        } catch(ExceptionB ex1){
            System.out.println("Error-1 got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        } catch(ExceptionC ex2){
            System.out.println("Error-2 got acquired => " + ex2);
        }
    }
}