public class usageOfArgs{
    public static void main(String args[]){
        System.out.println("args[0]: "+args[0]);
        System.out.println("args[1]: "+args[1]);
        System.out.println("args[2]: "+args[2]);
        System.out.println("Arithmetic operation: " + args[0] + args[1] + args[2]);

        switch(args[1]){
            case "+":
                System.out.println("Result: " + (Integer.valueOf(args[0]) + Integer.valueOf(args[2])));
                break;
            case "-":
                System.out.println("Result: " + (Integer.valueOf(args[0]) - Integer.valueOf(args[2])));
                break;
            case "/":
                System.out.println("Result: " + (Integer.valueOf(args[0]) / Integer.valueOf(args[2])));
                break;
            case "x":
                System.out.println("Result: " + (Integer.valueOf(args[0]) * Integer.valueOf(args[2])));
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
