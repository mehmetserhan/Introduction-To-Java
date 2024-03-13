public class ExceptionTesting {
    public int Divide(int num1, int num2) throws ExceptionA {
        if(num2==0){
            throw new ExceptionA("Your are trying to divide by 0.", 0);
        }
        return num1 / num2;
    }

    public static void main(String args[]){
        try {
            ExceptionTesting exp1 = new ExceptionTesting();
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = exp1.Divide(a, b);
            System.out.println(args[0] + "/" + args[1] + ": " + result);
        } catch(ExceptionA ex1) {
            System.out.println("An error got acquired => " + ex1.getMessage());
            System.out.println("Id: " + ex1.getId() + " => " + ex1.getLocalizedMessage());
        }
    }
}
