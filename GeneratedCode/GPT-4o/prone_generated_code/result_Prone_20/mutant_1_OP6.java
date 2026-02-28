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

        // Adding an unreachable for loop
        boolean conditionFor = getCondition(); // Ensure the loop condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop."); // This code is unreachable
        }

        return intArray;
    }

    private boolean getCondition() {
        return false; // This makes the for loop unreachable
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}