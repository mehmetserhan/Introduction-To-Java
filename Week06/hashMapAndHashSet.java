import java.util.*;

public class hashMapAndHashSet {
	public static void main(String[] args) {
		HashMap <String, String> hmap = new HashMap <String, String>();
		String cityCodes[][] = {{"06", "Ankara"}, {"09", "Aydin"}, {"35", "Izmir"}, {"34", "Istanbul"}};

		for(int i=0; i<cityCodes.length; i++){
			hmap.put(cityCodes[i][0], cityCodes[i][1]);			// filling the hashmap using key-values
		}

		System.out.println(hmap);
		System.out.println("34 -> " + hmap.get("34"));
		System.out.println("--------------------");
		
		HashSet <String> hset = new HashSet <String>();
        hset.add("15");
        hset.add("5");
        hset.add("20");
        hset.add("10");
        hset.add("15");
        hset.add("15");
        hset.add("15");
        System.out.println(hset);
	}
}
