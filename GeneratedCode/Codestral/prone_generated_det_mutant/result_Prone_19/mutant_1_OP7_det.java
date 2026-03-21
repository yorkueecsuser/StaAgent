import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        boolean kjunmpqs = false;while (kjunmpqs && true && false && false && true && false && true && false && false && false && false && false) {byte mfwmtrsa = -28;}
        // BUG: CollectionIncompatibleType
        return values.contains(value);
    
}

    public static void main(String[] args) {
        BuggyCollection buggyCollection = new BuggyCollection();
        Set<Long> values = new HashSet<>();
        values.add(123L);
        Integer value = 42;
        System.out.println(buggyCollection.showBug(values, value));
    }
}