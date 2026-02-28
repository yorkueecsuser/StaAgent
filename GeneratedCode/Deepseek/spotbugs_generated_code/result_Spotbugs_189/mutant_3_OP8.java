import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
     static List<String> COLLECTION = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    static {
        COLLECTION.add("Item1");
        COLLECTION.add("Item2");
    }

    public void showBug(String itemToAdd) {
        COLLECTION.add(itemToAdd); // This line demonstrates the bug
        System.out.println(COLLECTION);
    }

    public void someRandomMethod(String randomItem) {
        // Renaming 'randomItem' to 'item' based on Renaming Mutation Operator
        String item = randomItem;
        System.out.println("Random item: " + item);
    }
}