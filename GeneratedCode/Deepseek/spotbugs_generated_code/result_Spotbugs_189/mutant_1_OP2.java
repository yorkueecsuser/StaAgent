import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    static List<String> COLLECTION_DUPLICATE; // Mutant code

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
        COLLECTION_DUPLICATE = COLLECTION; // Mutant code; duplicating assignment statement
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        COLLECTION_DUPLICATE.add("Item3"); // Mutant code; duplicating the line that demonstrates the bug
        System.out.println(COLLECTION);
    }
}