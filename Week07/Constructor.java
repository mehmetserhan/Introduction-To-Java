public class Constructor {
    public Constructor(){
        System.out.println("Do nothing!");
    }
    public Constructor(int a){
        System.out.println(a);
    }
    public Constructor(int a, int b){
        System.out.println(a + " " + b);
    }

    public static void main(String args[]){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(3);
        Constructor c3 = new Constructor(6, 12);
    }
}
