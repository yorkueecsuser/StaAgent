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

        // Adding an unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }

        return intArray;
    }

    private boolean getFalseCondition() {
        // This method always returns false, but it is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}