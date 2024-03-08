import java.util.*;

public class linkedList{
    public static void main(String args[]){
        LinkedList <Integer> list = new LinkedList <Integer>();
        list.add(90);
        list.add(87);
        list.add(60);
        list.add(95);
        System.out.println("LinkedList --> " + list + " Size: " + list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println("LinkedList --> " + list + " Size: " + list.size());

        list.addFirst(89);
        System.out.println("LinkedList --> " + list + " Size: " + list.size());

        list.set(1, 50);
        System.out.println("LinkedList --> " + list + " Size: " + list.size());

        list.clear();
        System.out.println("LinkedList --> " + list + " Size: " + list.size());
        System.out.println("-----");

        
        // using linked lists as a stack
        LinkedList <String> cities = new LinkedList <String>();
		cities.addLast("Ankara");
		cities.addLast("Bursa");
		cities.addLast("Izmir");
		cities.addLast("Istanbul");

		for(int i=0; i<4; i++){
			System.out.println("Element got popped from the stack: " + cities.removeLast());
		}
    }
}