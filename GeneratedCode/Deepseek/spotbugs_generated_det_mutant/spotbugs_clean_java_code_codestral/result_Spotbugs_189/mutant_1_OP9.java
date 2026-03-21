import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        int i = 0;
        do {
            if (i < 2) {
                COLLECTION.add("Item" + (i+1));
                i++;
            } else {
                break;
            }
        } while (true);
    }

    public void showBug() {
        COLLECTION.add("Item3"); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }
}