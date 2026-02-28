import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static final List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    // Mutant code: Add a method that modifies the collection
    public void modifyCollection() {
        // Equivalent Loop Replacement: Replace the for loop with a do-while loop
        int i = 0;
        do {
            COLLECTION.set(i, "ModifiedItem" + i); // Modify the collection
            i++;
        } while (i < COLLECTION.size());
    }
}