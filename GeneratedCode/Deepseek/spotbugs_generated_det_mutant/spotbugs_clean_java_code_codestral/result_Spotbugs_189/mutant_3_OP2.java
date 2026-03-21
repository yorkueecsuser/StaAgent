import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // Original mutable collection
     static List<String> DUPLICATE_COLLECTION = new ArrayList<>(); // Duplicate mutable collection

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");

        DUPLICATE_COLLECTION.add("Item1");
        DUPLICATE_COLLECTION.add("Item2");
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        DUPLICATE_COLLECTION.add("Item3"); // Duplicate bug

        System.out.println(COLLECTION);
        System.out.println(DUPLICATE_COLLECTION);
    }
}