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

        // Adding unreachable for loop as per mutation operator
        boolean conditionFor = getCondition(); // Dynamically determine the condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }

        return intArray;
    }

    // Helper method to provide a condition for the unreachable loop
    private boolean getCondition() {
        return false; // Ensures the loop is unreachable
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}