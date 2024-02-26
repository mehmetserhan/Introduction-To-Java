import java.util.Scanner;

public class controlStatements{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Type the difficulty to start the game! [easy] - [medium] - [hard] -> ");
        String level;
        level = read.nextLine();

        switch(level){
            case "easy": 
                System.out.println("Starting " + level + " mode.");
                break;
            case "medium": 
                System.out.println("Starting " + level + " mode.");
                break;
            case "hard": 
                System.out.println("Starting " + level + " mode.");
                break;
            default:
                System.out.println("Invalid input!");
        }

        System.out.println("-----------------------------------");

        System.out.print("Choose a number between 0-20: ");
        int number;
        number = read.nextInt();

        if(number>=0 && number<=20)
            System.out.println("Your choice: " + number);
        else
            System.out.println("Choose a number between the range.");


        if((number % 5 == 0) && (number % 3 == 0))
            System.out.println("FizzBuzz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println("You lose!");

        read.close();
    }
}