import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            if (list.contains(element)) { 
                return Integer.parseInt(element);
            }
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            return map.containsKey(key);
        }
        return false; // Unreachable due to return in else
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            return set.remove(element);
        }
        return false; // Unreachable due to return in else
    }

    // Helper method to simulate a false condition at runtime
    private boolean getFalseCondition() {
        return false;
    }
}