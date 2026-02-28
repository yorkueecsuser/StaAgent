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

        // Unreachable for loop using a non-final variable
        boolean unreachableLoopCondition = getFalseCondition();
        for (int i = 0; unreachableLoopCondition; i++) {
            System.out.println("This loop is unreachable");
        }

        return intArray;
    }

    // Method to simulate a dynamic false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}