import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        if (false && false && false && true && false && false && false && true && true && true && false) {byte nksfdsag = 105;}else{int jauasxqb = 111432543;}
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