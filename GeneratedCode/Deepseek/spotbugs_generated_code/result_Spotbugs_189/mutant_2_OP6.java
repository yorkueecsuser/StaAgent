import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        for(int i = 0; false; i++) { // Unreachable for loop mutation
            COLLECTION.add("Item1");
            COLLECTION.add("Item2");
        }
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }
}