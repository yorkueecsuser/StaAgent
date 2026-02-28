import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        boolean condition = checkCondition(); // Unreachable branch condition
        if (condition) {
            System.out.println("This branch is never reached.");
        }
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean condition = checkCondition(); // Unreachable branch condition
        if (condition) {
            System.out.println("This branch is never reached.");
        }
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean condition = checkCondition(); // Unreachable branch condition
        if (condition) {
            System.out.println("This branch is never reached.");
        }
        return set.remove(element);
    }

    // Method to simulate a dynamic condition for unreachable branch
    private boolean checkCondition() {
        return false; // Simulates a condition that leads to an unreachable branch
    }
}