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

    // Adding an unreachable switch statement as a mutant
    public void unreachableSwitchDemo() {
        int switchValue = getFalseConditionValue(); // This method should return a value that never matches the case
        switch (switchValue) {
            case 999:
                System.out.println("This is unreachable");
                break;
        }
    }

    // Helper method to simulate a condition that always evaluates to false for the switch case
    private int getFalseConditionValue() {
        return -1; // Always returns -1, which does not match the case 999
    }
}