import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Unreachable while loop
        boolean conditionWhile1 = getUnreachableCondition();
        while (conditionWhile1) {
            System.out.println("This is an unreachable while loop in showBug1.");
        }

        // Original code
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Unreachable while loop
        boolean conditionWhile2 = getUnreachableCondition();
        while (conditionWhile2) {
            System.out.println("This is an unreachable while loop in showBug2.");
        }

        // Original code
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Unreachable while loop
        boolean conditionWhile3 = getUnreachableCondition();
        while (conditionWhile3) {
            System.out.println("This is an unreachable while loop in showBug3.");
        }

        // Original code
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }
    
    private boolean getUnreachableCondition() {
        return false; // This method is used to simulate a condition that evaluates to false.
    }
}