import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Dead Store: Adding an unused integer variable
        int xzjfqedb = 12345678; // This is a dead store, unused variable
        
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Dead Store: Adding an unused string variable
        String qzwsxctv = "deadstore"; // This is a dead store, unused variable
        
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Dead Store: Adding an unused double variable
        double plmnbvcs = 3.14159; // This is a dead store, unused variable
        
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }
}