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

    // Mutant Code: Renaming a user-defined variable
    public Integer showBug1Mutant(List<Integer> a, String b) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (a.contains(b)) { 
            return Integer.parseInt(b);
        }
        return null;
    }

    // Mutant Code: Renaming a user-defined variable
    public boolean showBug2Mutant(Map<Integer, String> x, String y) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return x.containsKey(y);
    }

    // Mutant Code: Renaming a user-defined variable
    public boolean showBug3Mutant(Set<Double> m, Integer n) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return m.remove(n);
    }
}