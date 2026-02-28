import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
     static String deadStoreVariable; // Dead store mutation

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
        deadStoreVariable = "I'm unused"; // Assigning a value to the dead store variable
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }
}