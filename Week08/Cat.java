class Cat{
    protected int paws = 4;
    public void huntRat(){
        System.out.println("A cat hunted a rat.");
    }
    public static void main(String args[]){
        Cat cat1 = new Cat();
        cat1.huntRat();
        System.out.printf("Cats have %d paws\n", cat1.paws);
    }
}

class Tabby extends Cat{
    public void huntRat(){                                                  // override
        System.out.println("A tabby cat hunted a rat.");
    }
    public static void main(String args[]){
        Tabby cat2 = new Tabby();
        cat2.huntRat();                                                     // it prioritizes the overriden method in itself
        System.out.printf("Tabby cats have %d paws", cat2.paws);     // Tabby class can access to "paws" even though Tabby 
    }                                                                       // class has no such "paws" variable thanks to "paws" being protected
}