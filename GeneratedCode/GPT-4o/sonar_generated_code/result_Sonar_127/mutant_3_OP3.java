import java.util.*;

class CollectionBugDemo {

    public Integer showBug1(List<Integer> list, String element) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition1 = getUnreachableCondition1();
        if (unreachableCondition1) {
            // Unreachable block
            System.out.println("This is unreachable code in showBug1");
        }
        if (list.contains(element)) { 
            return Integer.parseInt(element);
        }
        return null;
    }

    public boolean showBug2(Map<Integer, String> map, String key) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition2 = getUnreachableCondition2();
        if (unreachableCondition2) {
            // Unreachable block
            System.out.println("This is unreachable code in showBug2");
        }
        return map.containsKey(key);
    }

    public boolean showBug3(Set<Double> set, Integer element) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        boolean unreachableCondition3 = getUnreachableCondition3();
        if (unreachableCondition3) {
            // Unreachable block
            System.out.println("This is unreachable code in showBug3");
        }
        return set.remove(element);
    }

    // Dynamic condition methods to ensure runtime determination
    private boolean getUnreachableCondition1() {
        return false;
    }
    
    private boolean getUnreachableCondition2() {
        return false;
    }
    
    private boolean getUnreachableCondition3() {
        return false;
    }
}