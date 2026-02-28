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

        // Mutation Operator: Duplication
        Integer[] intArrayDup = stringList.toArray(new Integer[0]); // Duplicate statement to create mutation

        return intArray;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}