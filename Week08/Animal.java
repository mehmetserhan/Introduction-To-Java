class Animal{
    public Animal(){
        System.out.print("Animal ");
    }
}

class Mammal extends Animal{
    public Mammal(){
        System.out.print("Mammal ");
    }
}

class Feline extends Mammal{
    public Feline(){
        System.out.print("Feline ");
    }
}

class Tiger extends Feline{
    public Tiger(){
        System.out.println("Tiger");
    }
    public static void main(String args[]){
        Tiger tgr = new Tiger();
        //Feline fln = new Feline();
        //Mammal mml = new Mammal();
        //Animal anml = new Animal();
    }
}