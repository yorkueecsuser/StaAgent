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

// Mutant: Renaming a user-defined variable
class CollectionToArrayExampleMutant {

    public Object[] showBug() {
        List<String> a = new ArrayList<>(); // Renamed stringList to a
        a.add("Hello");
        a.add("World");

        // Demonstrating CollectionToArraySafeParameter bug
        // BUG: CollectionToArraySafeParameter
        Integer[] b = a.toArray(new Integer[0]); // Renamed intArray to b

        return b;
    }

    public static void main(String[] args) {
        CollectionToArrayExampleMutant example = new CollectionToArrayExampleMutant();
        example.showBug();
    }
}