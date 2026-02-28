import java.util.ArrayList;
import java.util.List;

class CollectionToArrayExample {
    
    private boolean getCondition() {
        return false; // This ensures that the switch case is unreachable
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Demonstrating CollectionToArraySafeParameter bug
        // BUG: CollectionToArraySafeParameter
        Integer[] intArray = stringList.toArray(new Integer[0]); // This will cause ArrayStoreException at runtime

        // Unreachable switch statement
        int value = getCondition() ? 1 : 0;
        switch(value) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case does nothing
                break;
        }

        return intArray;
    }

    public static void main(String[] args) {
        CollectionToArrayExample example = new CollectionToArrayExample();
        example.showBug();
    }
}