import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }

        // Adding unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                break;
        }

        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsKey = map.containsKey(key);

        // Adding unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 2:
                System.out.println("This will never be executed");
                break;
            default:
                break;
        }

        return containsKey;
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean removed = set.remove(element);

        // Adding unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 3:
                System.out.println("This will never be executed");
                break;
            default:
                break;
        }

        return removed;
    }

    // Method to simulate a condition that always leads to the default case in switch
    private int getUnreachableCondition() {
        return -1;  // A value that doesn't match any case in the switch statement
    }
}