package accounting;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapComparison {
    public static void main(String[] args) {
    	
        Map<String, Integer> map1 = new HashMap<>();
        
        map1.put("7200101", 20);
        map1.put("7200102", 22);
        map1.put("7200103", 25);
        map1.put("7200104", 26);
        map1.put("153200101", 20);
        map1.put("153200102", 22);
        map1.put("153200103", 25);
        map1.put("153200104", 26);

        Map<String, Integer> map2 = new HashMap<>();
        
        map2.put("7200101", 20);
        map2.put("7200102", 22);
        map2.put("7200103", 25);
        map2.put("7200104", 26);
        map2.put("153200101", 20);
        map2.put("153200102", 22);
        map2.put("153200103", 29);
        
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("153200101", 20);
        map3.put("153200102", 22);
        map3.put("153200103", 25); // Different content

        // Compare map1 and map2
        if(map1.equals(map2))
        {
        	System.out.println("map1 and map2 are equal"); // Output: true
        }
        else
        {        
        	System.out.println("map1 and map2 are not equal"); // Output: false

        	if (map1.size() != map2.size()) {
	            System.out.println("Total number of Item and Store combination are not matching");
	        }
	
	        for (Entry<String, Integer> entry : map1.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            
                String ItemCode = key.substring(key.length()-6);
                String Storenumber = key.substring(0,key.length()-6);
	
	            if (!map2.containsKey(key)) 
	            {              
	            	System.out.println("Item and Store combination is not available for : " +ItemCode + " and: " +Storenumber);
	            }
	            else if (!value.equals(map2.get(key)))
	            {
	            System.out.println("Inventory values are not matching for : " +ItemCode + " and: " +Storenumber);
	            }
	        }
        }
    } 
}
