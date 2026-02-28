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

    // Mutant 1: Renaming variable within showBug1 method
    public Integer showBug1_mutant1(List<Integer> list, String x) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (list.contains(x)) { 
            return Integer.parseInt(x);
        }
        return null;
    }

    // Mutant 2: Renaming variable within showBug2 method
    public boolean showBug2_mutant2(Map<Integer, String> map, String y) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return map.containsKey(y);
    }

    // Mutant 3: Renaming variable within showBug3 method
    public boolean showBug3_mutant3(Set<Double> set, Integer z) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return set.remove(z);
    }
}