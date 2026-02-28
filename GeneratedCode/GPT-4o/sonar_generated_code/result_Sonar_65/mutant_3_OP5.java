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

        // Adding an unreachable switch statement as a mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        return -1; // Ensures the switch case is unreachable
    }

    public static void main(String[] args) {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        int[] myArray = {1, 2, 3};
        example.showBug(myList, myArray);
    }
}