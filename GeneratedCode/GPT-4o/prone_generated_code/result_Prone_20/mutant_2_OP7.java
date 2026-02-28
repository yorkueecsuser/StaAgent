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

        // Introduce an unreachable while loop with a dynamically determined false condition
        boolean conditionWhile = getCondition(); // This method simulates a dynamic condition
        while (conditionWhile) { 
            // Unreachable code block
            System.out.println("This code block is unreachable.");
        }

        return intArray;
    }

    // Simulating the dynamic condition for the while loop
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}