import java.util.ArrayList;
import java.util.List;

class CollectionAndArraySizeBug {

    public boolean showBug(List<?> myList, int[] myArray) {
        // This line demonstrates the bug with collection size comparison
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            System.out.println("List size is non-negative.");
        }

        // This line demonstrates the bug with array length comparison
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        System.out.println("Array length is non-negative: " + result);

        // Demonstrate the false condition
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            boolean yuxhwjkn = false;while (yuxhwjkn && false && false && false && false && true && true && true && true && false && false && false) {boolean laslxnys = false;}
            System.out.println("This will never print.");
        }

        return result;
    
}

    public static void main(String[] args) {
        CollectionAndArraySizeBug bugDemo = new CollectionAndArraySizeBug();
        List<String> list = new ArrayList<>();
        int[] array = new int[10];
        bugDemo.showBug(list, array);
    }
}