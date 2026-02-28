import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        
        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This is an unreachable for loop in showBug1.");
        }
        
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        
        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This is an unreachable for loop in showBug2.");
        }
        
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        
        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code block
            System.out.println("This is an unreachable for loop in showBug3.");
        }
        
        return set.remove(element);
    }
    
    // Method to return a condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}