import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String args[]){
		Queue <String> queue = new LinkedList <String>();
        queue.offer("Ankara");
        queue.offer("Samsun");
        queue.offer("Izmir");
        queue.offer("Istanbul");

        System.out.println("Is queue empty? " + queue.isEmpty());

		if(!queue.isEmpty()){
			System.out.println("Queue size: " + queue.size());
		}
		else{
			System.out.println("Queue is empty: " + queue.isEmpty());
		}

        while(!queue.isEmpty()){
        	System.out.println(queue.remove());
        }

        System.out.println("Is queue empty? " + queue.isEmpty());
		System.out.println("-----");


		// using linked lists as a queue
		LinkedList <String> list = new LinkedList <String>();
		list.addLast("Ankara");
		list.addLast("Bursa");
		list.addLast("Izmir");
		list.addLast("Istanbul");

		int size = list.size();
		for(int i=0; i<size; i++){
			System.out.println(list);
			System.out.println("Element got popped -> " + list.removeFirst());
		}
		System.out.println(list);
	}
}
