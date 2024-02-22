import java.util.Arrays;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector <String> vector = new Vector <String>();
		String arr[] = {"Ankara", "Izmir", "Istanbul", "Samsun"};
		System.out.println("Array elements: ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
			vector.add(arr[i]);
		}

		vector.set(3, "Bursa");
		System.out.println("Vector capacity: " + vector.capacity());
		System.out.println("Vector size: " + vector.size());
		System.out.println("Vector first element: " + vector.firstElement());
		System.out.println("Vector last element: " + vector.lastElement());
		System.out.println("-----");
		
		Vector <Integer> nums = new Vector <Integer>();
		nums.add(15);
		nums.add(20);
		nums.add(5);
		nums.add(10);

		Object arr1[] = nums.toArray();
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n");

		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\n");
		
		System.out.println("Smallest number: " + arr1[0]);
	}
}
