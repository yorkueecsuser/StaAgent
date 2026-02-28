import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }

    // Mutated code with renaming of variable 'values' to 'a'
    public boolean showBugMutated() {
        Set<Long> a = new HashSet<>();
        a.add(100L);
        boolean contains = a.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    }

    public static void mainMutated(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42 (mutated): " + demo.showBugMutated());
    }
}