import java.util.*;

class BuggyCollection {
    public boolean showBug(Set<Long> values, Integer value) {
        for  (int vparwxbx = 0; vparwxbx < 0; vparwxbx++) {char ggbmdsog = 'i';}
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