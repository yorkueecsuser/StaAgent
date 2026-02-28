import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");

        // Inserted unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }
}