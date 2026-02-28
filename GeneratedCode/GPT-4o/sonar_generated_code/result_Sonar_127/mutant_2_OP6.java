import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Unreachable for loop inserted
        boolean conditionForBug1 = getCondition();
        for (int i = 0; conditionForBug1; i++) {
            // Unreachable code
        }
        
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Unreachable for loop inserted
        boolean conditionForBug2 = getCondition();
        for (int i = 0; conditionForBug2; i++) {
            // Unreachable code
        }
        
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Unreachable for loop inserted
        boolean conditionForBug3 = getCondition();
        for (int i = 0; conditionForBug3; i++) {
            // Unreachable code
        }
        
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }
    
    // Helper method to ensure conditions are dynamically determined at runtime
    private boolean getCondition() {
        return false; // This can be replaced with any dynamic condition
    }
}