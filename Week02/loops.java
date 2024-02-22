public class loops{
    public static void main(String args[]){
        int k = 5;
        int m = 3;

        // for loop
        for(int i=0; i<10; i++){
            System.out.println("i: "+ i);
        }
        System.out.println("-----");
        
        // while loop
        while(k>0){
            System.out.println("k: " + k);
            k--;
        }
        System.out.println("-----");

        // do-while loop
        do{
            System.out.println("m: " + m);
        }while(m<2);
    }
}