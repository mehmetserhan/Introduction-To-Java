// super must always be in the first line of the constructor

class Human{
    public Human(int number){
        System.out.println("Human - super: " + number);
    }
}

class intelligentHuman extends Human{
    public intelligentHuman(int number){
        super(number + 10);
        System.out.println("Intelligent Human - super: " + number);
    }
}

class Hacker extends intelligentHuman{
    public Hacker(int number){
        super(number + 10);
        System.out.println("Hacker - super: " + number);
    }

    public static void main(String args[]){
        Hacker hckr = new Hacker(10);
    }
}