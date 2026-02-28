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

        return intArray;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}

// Mutated code starts here
class CollectionToArrayExampleMutant {

    public Object[] showBug() {
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");

        // Demonstrating CollectionToArraySafeParameter bug
        // BUG: CollectionToArraySafeParameter
        Integer[] i = l.toArray(new Integer[0]); // This will cause ArrayStoreException at runtime

        return i;
    }

    public static void main(String[] args) {
        CollectionToArrayExampleMutant mutantExample = new CollectionToArrayExampleMutant();
        mutantExample.showBug();
    }
}