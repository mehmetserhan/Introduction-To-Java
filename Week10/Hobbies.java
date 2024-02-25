abstract class Activity{
    public abstract void doActivity();
}

interface Art{
    public void makeArt();
}

interface Sports{
    public void doSports();
}

class Human extends Activity implements Art, Sports{                        // multiple interfaces got implemented at the same time
    public void doActivity(){                                               // must be overriden because Activity is an abstract class
        System.out.println("I will do an activity.");
    }
    public void makeArt(){                                                  // must be overriden because Activity abstract class implements Art interface
        System.out.println("I'll fill this canvas with colors!");
    }
    public void doSports(){                                                 // must be overriden because Activity abstract class implements Sports interface
        System.out.println("Oh I'm really good at sports!");
    }
}

public class Hobbies{
    public static void main(String args[]){
        Human josh = new Human();
        josh.doActivity();
        josh.makeArt();
        josh.doSports();
    }
}