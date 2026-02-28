import java.util.ArrayList;
import java.util.List;

class CollectionSizeBugExample {

    public boolean showBug(List<String> myList, int[] myArray) {
        // Demonstrating the bug with collection size check
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            System.out.println("Collection is not negative in size, always true");
        }

        // Demonstrating the bug with array length check
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        System.out.println("Array length is not negative, always true");

        // Demonstrating the bug with a less than zero check on collection size
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            System.out.println("This will never be printed, size is never negative");
        }

        // Inserting unreachable switch statement
        int unreachableSwitchCondition = calculateUnreachableSwitchCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This switch case is unreachable");
                break;
            default:
                // Do nothing
                break;
        }

        return result;
    }

    private int calculateUnreachableSwitchCondition() {
        // A method that returns a value ensuring the switch case is unreachable
        return 0; // This value does not match any case
    }

    public static void main(String[] args) {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        int[] myArray = {1, 2, 3};
        example.showBug(myList, myArray);
    }
}