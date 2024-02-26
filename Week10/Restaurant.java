interface Dish{
    public interface MainDish{
        public void prepareMainDish();
    }
    public interface Soup{
        public void prepareSoup();
    }
    public interface Sweet{
        public void prepareSweet();
    }
}

class Cook1 implements Dish.MainDish{
    public void prepareMainDish(){
        System.out.println("Main dish is done by Cook 1.");
    }
}

class Cook2 implements Dish.Soup{
    public void prepareSoup(){
        System.out.println("Soup is done by Cook 2.");
    }
}

public class Restaurant{
    public static void main(String args[]){
        Cook1 ck1 = new Cook1();
        Cook2 ck2 = new Cook2();
        ck1.prepareMainDish();
        ck2.prepareSoup();
    }
}