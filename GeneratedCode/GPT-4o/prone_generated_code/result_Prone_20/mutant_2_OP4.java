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

        // Inserting an unreachable if-else statement
        boolean condition = getDynamicCondition(); // Ensures the condition is determined at runtime
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("Unreachable if-else statement inserted.");
        }

        return intArray;
    }

    // Method to get a dynamic condition
    private boolean getDynamicCondition() {
        return false; // Always returns false making the if block unreachable
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}