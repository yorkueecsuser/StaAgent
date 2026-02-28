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

        return result;
    }

    // Mutant code with a renamed variable
    public boolean showBugRenamed(List<String> a, int[] b) {
        // Demonstrating the bug with collection size check
        if (a.size() >= 0) { 
            System.out.println("Collection is not negative in size, always true");
        }

        // Demonstrating the bug with array length check
        boolean c = b.length >= 0; 
        System.out.println("Array length is not negative, always true");

        // Demonstrating the bug with a less than zero check on collection size
        if (a.size() < 0) { 
            System.out.println("This will never be printed, size is never negative");
        }

        return c;
    }

    public static void main(String[] args) {
        CollectionSizeBugExample example = new CollectionSizeBugExample();
        List<String> myList = new ArrayList<>();
        int[] myArray = {1, 2, 3};
        example.showBug(myList, myArray);
        
        // Calling the mutant method
        example.showBugRenamed(myList, myArray);
    }
}