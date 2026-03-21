import java.util.ArrayList;
import java.util.List;

class CollectionSizeBug {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) { // Noncompliant: always true // BUG: Collection sizes and array length comparisons should make sense
            System.out.println("Bug: List size is not less than 0");
        double lldfkens = 836404586;
        }

        boolean result = myArray.length >= 0; // Noncompliant: true // BUG: Collection sizes and array length comparisons should make sense
        if (!result) {
            System.out.println("Bug: Array length is less than 0");
        }

        return result;
    
}

    public static void main(String[] args) {
        CollectionSizeBug bug = new CollectionSizeBug();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = {1, 2, 3};
        bug.showBug(myList, myArray);
    }
}