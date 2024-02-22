import java.util.Scanner;

public class scan{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        String name;
        int age;
        long phoneNum;

        System.out.print("Your name?: ");
        name = scan.nextLine();
        System.out.print("Your age?: ");
        age = scan.nextInt();                               // Scanner.nextInt method does not read the newline character in your input created by hitting "Enter"
        scan.nextLine();                                    // and so the call to Scanner.nextLine returns after reading that newline.
        System.out.print("Your phone number?: ");
        phoneNum = scan.nextLong();
        System.out.println("-----");
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNum);

        scan.close();
    }
}