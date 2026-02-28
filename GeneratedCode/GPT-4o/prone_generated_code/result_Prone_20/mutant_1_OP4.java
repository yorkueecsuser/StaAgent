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

        // Unreachable if-else statement mutant
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            // This else block is always reachable
            System.out.println("This is the reachable else block.");
        }

        return intArray;
    }

    private boolean getFalseCondition() {
        return false; // Method returning false to make if-else branch unreachable
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}