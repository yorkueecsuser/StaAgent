import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    }

    // Mutated method with renamed variable
    public boolean showBugMutant() {
        Set<Long> a = new HashSet<>();
        a.add(1L);
        a.add(2L);
        a.add(3L);

        // BUG: CollectionIncompatibleType
        return a.contains(42); // This will return false due to incompatible types
    }

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);

        // Call the mutated method
        boolean mutantResult = example.showBugMutant();
        System.out.println("Contains 42 in mutant: " + mutantResult);
    }
}