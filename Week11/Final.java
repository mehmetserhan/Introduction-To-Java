class ClassA {
    public final void Method(){
        System.out.println("I do this.");
    }
}

class ClassB extends ClassA {
    // public void Method(){                   // final methods can't be overriden
    //     System.out.println("Can I override it?");
    // }
}

final class ClassC {
    char letter = 'C';
}

// class ClassD extends ClassC {               // final classes can't be extended
//     char letter = 'D';
// }

public class Final {
    public static void main(String args[]){
        ClassA a = new ClassA();
        a.Method();

        ClassB b = new ClassB();
        b.Method();

        ClassC c = new ClassC();
        System.out.println(c.letter);

        // ClassD d = new ClassD();
        // System.out.println(d.letter);

        // final int num = 5;
        // num = 10;                           // can't change the value of a final variable neither

    }
}
