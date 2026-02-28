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

    // Mutant code
    public Integer mutantShowBug1(List<Integer> x, String y) {
        // Attempting to check if a String element is in a List of Integers
        // BUG: Inappropriate "Collection" calls should not be made
        if (x.contains(y)) { 
            return Integer.parseInt(y);
        }
        return null;
    }

    public boolean mutantShowBug2(Map<Integer, String> a, String b) {
        // Attempting to check if a String key is in a Map with Integer keys
        // BUG: Inappropriate "Collection" calls should not be made
        return a.containsKey(b);
    }

    public boolean mutantShowBug3(Set<Double> c, Integer d) {
        // Attempting to remove an Integer element from a Set of Doubles
        // BUG: Inappropriate "Collection" calls should not be made
        return c.remove(d);
    }
}