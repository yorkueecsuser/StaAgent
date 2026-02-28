import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(element);
    }

    // Method to provide a dynamic condition for unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public void unreachableExample() {
        // Inserting an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
        }
    }
}