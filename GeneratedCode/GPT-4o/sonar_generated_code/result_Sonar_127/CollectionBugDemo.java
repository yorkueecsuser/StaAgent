import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Insert unreachable while loop
        boolean condition = getFalseCondition();
        while (condition) {
            // Unreachable code
            System.out.println("Unreachable while loop in showBug1");
        }

        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Insert unreachable while loop
        boolean condition = getFalseCondition();
        while (condition) {
            // Unreachable code
            System.out.println("Unreachable while loop in showBug2");
        }

        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Insert unreachable while loop
        boolean condition = getFalseCondition();
        while (condition) {
            // Unreachable code
            System.out.println("Unreachable while loop in showBug3");
        }

        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }

    // Helper method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false; // or any other logic that evaluates to false at runtime
    }
}