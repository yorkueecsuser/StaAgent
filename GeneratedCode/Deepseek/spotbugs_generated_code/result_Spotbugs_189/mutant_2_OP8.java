import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> mUTABLE_COLLECTION = new ArrayList<>(); // Renamed "COLLECTION" to "mUTABLE_COLLECTION"

    static {
        mUTABLE_COLLECTION.add("Item1");
        mUTABLE_COLLECTION.add("Item2");
    }

    public void showBug() {
        mUTABLE_COLLECTION.add("Item3"); // This line still demonstrates the bug
        System.out.println(mUTABLE_COLLECTION);
    }
}