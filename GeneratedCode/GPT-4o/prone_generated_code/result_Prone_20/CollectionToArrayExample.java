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

        // Adding an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is never executed
            System.out.println("This is an unreachable line of code inside the while loop.");
        }

        return intArray;
    }

    private boolean getCondition() {
        return false; // This ensures the while loop is never executed
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}