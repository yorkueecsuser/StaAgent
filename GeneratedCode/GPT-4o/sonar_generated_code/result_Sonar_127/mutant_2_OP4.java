import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }

        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable
            return -1;
        } else {
            // This block will always execute when the above if is false
        }
        
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // Unreachable code block
            return false;
        }
        
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        if (getFalseCondition()) {
            // This block is unreachable
            return false;
        } else {
            // This block will always execute when the above if is false
        }
        
        return set.remove(element);
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}