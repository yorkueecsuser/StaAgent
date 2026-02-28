import java.util.ArrayList;
import java.util.List;

class CollectionToArrayExample {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Demonstrating CollectionToArraySafeParameter bug
        // BUG: CollectionToArraySafeParameter
        Integer[] intArray = stringList.toArray(new Integer[0]); // This will cause ArrayStoreException at runtime

        // Dead Store Mutation
        int abcdefgh = 42; // This variable is declared but never used

        return intArray;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}