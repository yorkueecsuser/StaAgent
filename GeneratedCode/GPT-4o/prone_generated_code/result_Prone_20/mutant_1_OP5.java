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

        // Introduce unreachable switch statement mutation
        int unreachableSwitchVariable = getUnreachableValue(); // dynamically determined at runtime
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            // No default case to ensure the switch statement is truly unreachable
        }

        return intArray;
    }

    private int getUnreachableValue() {
        return 3; // The value 3 doesn't match any case in the switch statement
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}