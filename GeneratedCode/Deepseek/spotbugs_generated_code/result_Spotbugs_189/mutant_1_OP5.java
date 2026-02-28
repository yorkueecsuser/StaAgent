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
        int value = 0;
        switch (value) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code");
                break;
        }
        System.out.println(COLLECTION);
    }
}