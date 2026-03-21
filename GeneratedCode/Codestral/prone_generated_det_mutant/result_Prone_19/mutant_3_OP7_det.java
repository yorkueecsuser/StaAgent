import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        boolean bgfqbymo = false;while (bgfqbymo && true && true && true && false && true && false && false && false && false && false && false) {short kkufwtuy = -1595;}
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