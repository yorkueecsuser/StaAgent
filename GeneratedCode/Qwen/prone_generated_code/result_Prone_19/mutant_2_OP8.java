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

    // Mutated code
    public boolean showBugMutant() {
        Set<Long> x = new HashSet<>();
        x.add(100L);
        boolean y = x.contains(42); // BUG: CollectionIncompatibleType
        return y;
    }

    public static void mainMutant(String[] args) {
        CollectionBugDemo z = new CollectionBugDemo();
        System.out.println("Contains 42: " + z.showBugMutant());
    }
}