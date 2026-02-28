import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(element)) {
            return Integer.parseInt(element);
        }

        // Unreachable switch statement
        int unreachableValue = computeValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This code is unreachable.");
                break;
        }

        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean result = map.containsKey(key);

        // Unreachable switch statement
        int unreachableCondition = evaluateKey();
        switch (unreachableCondition) {
            case 888: // This case will never be reached
                System.out.println("Unreachable code path.");
                break;
        }

        return result;
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean success = set.remove(element);

        // Unreachable switch statement
        int unreachableStatus = checkStatus();
        switch (unreachableStatus) {
            case 777: // This case will never be reached
                System.out.println("This part of the code is unreachable.");
                break;
        }

        return success;
    }

    // Helper methods to ensure the unreachable switch statements are correctly implemented
    private int computeValue() {
        return 0; // Ensures that the switch case in showBug1 is never hit
    }

    private int evaluateKey() {
        return 0; // Ensures that the switch case in showBug2 is never hit
    }

    private int checkStatus() {
        return 0; // Ensures that the switch case in showBug3 is never hit
    }
}