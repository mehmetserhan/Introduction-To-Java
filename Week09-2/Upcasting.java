class Exercise {
    public static void doExercise(Sportsman person){
        person.doWorkout();
    }
}

class Sportsman {
    public void doWorkout(){
        System.out.println("The sportsman is working out.");
    }
}

class Footballer extends Sportsman {
    public void doWorkout(){
        System.out.println("The footballer is working out.");
    }
}

public class Upcasting {
    public static void main(String args[]){
        Sportsman person1 = new Sportsman();
        Footballer person2 = new Footballer();

        Exercise.doExercise(person1);
        Exercise.doExercise(person2);
    }
}
