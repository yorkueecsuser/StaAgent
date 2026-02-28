import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    static List<String> MUTATED_COLLECTION = new ArrayList<>(COLLECTION); // Mutant code: Duplication of initialization

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
        MUTATED_COLLECTION.add("Item3"); // This line demonstrates the bug in the mutant code
        System.out.println(MUTATED_COLLECTION);
    }
}