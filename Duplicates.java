import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static void main(String[] args) {
        // Define an array with some values
        int[] arr = {2,5,2,7,8,2,7,8,9,10, 8, 20};
        
        // Create a HashMap to store the occurrences of each value in the array
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        
        // Iterate through the array and add each value and its index to the map
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<Integer>());
            }
            map.get(arr[i]).add(i);
        }
        
        // Print the indices of each duplicate value with commas
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.print(entry.getKey() + ": ");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.print(entry.getValue().get(i));
                    if (i < entry.getValue().size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
    
}
