import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        // Unreachable if-else statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a unique unreachable branch for showBug1");
        } else {
            System.out.println("This is the else branch for showBug1");
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean result = map.containsKey(key);
        
        // Unreachable if-else statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a unique unreachable branch for showBug2");
        } else {
            System.out.println("This is the else branch for showBug2");
        }
        
        return result;
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean result = set.remove(element);
        
        // Unreachable if-else statement added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a unique unreachable branch for showBug3");
        } else {
            System.out.println("This is the else branch for showBug3");
        }
        
        return result;
    }
    
    private boolean getCondition() {
        // This method simulates a dynamic condition that is always false
        return false;
    }
}