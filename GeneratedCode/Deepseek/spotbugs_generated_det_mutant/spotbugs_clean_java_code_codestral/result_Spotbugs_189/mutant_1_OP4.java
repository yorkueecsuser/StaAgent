import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>();

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code block
            System.out.println("This is unreachable code");
        } else {
            COLLECTION.add("Item3"); // This line demonstrates the bug
            System.out.println(COLLECTION);
        }
    }
}