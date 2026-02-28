import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block will never execute.");
        }
        
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block will never execute.");
        }
        
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block will never execute.");
        }
        
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }
    
    // Method to simulate a dynamic condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}