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

        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // dynamically determined at runtime
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable else branch.");
        }

        return intArray;
    }

    private boolean getCondition() {
        return false; // This simulates an unreachable if branch when evaluated
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}