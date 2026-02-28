import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);

        // Mutation: Added unreachable switch statement
        int unreachableValue = 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }
    }
}