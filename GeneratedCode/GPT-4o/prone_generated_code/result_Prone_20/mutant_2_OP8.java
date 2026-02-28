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

class CollectionToArrayExampleRenamed {

    public Object[] showBugRenamed() {
        List<String> b = new ArrayList<>(); // Renamed variable
        b.add("Hello");
        b.add("World");

        // Demonstrating CollectionToArraySafeParameter bug
        // BUG: CollectionToArraySafeParameter
        Integer[] c = b.toArray(new Integer[0]); // Renamed variable, this will cause ArrayStoreException at runtime

        return c;
    }

    public static void main(String[] args) {
        CollectionToArrayExampleRenamed exampleRenamed = new CollectionToArrayExampleRenamed();
        exampleRenamed.showBugRenamed();
    }
}