import java.util.ArrayList;
import java.util.List;

class CollectionAndArrayBug {

    public boolean showBug1(List<Integer> myList) {
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
    }

    public boolean showBug2(int[] myArray) {
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        return result;
    }

    public boolean showBug3(List<Integer> myList) {
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
    }

    // Mutant 1: Renaming myList to a in showBug1
    public boolean showBug1Mutant1(List<Integer> a) {
        if (a.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
    }

    // Mutant 2: Renaming myArray to b in showBug2
    public boolean showBug2Mutant2(int[] b) {
        boolean result = b.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        return result;
    }

    // Mutant 3: Renaming myList to c in showBug3
    public boolean showBug3Mutant3(List<Integer> c) {
        if (c.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        
        System.out.println("showBug1 result: " + bugDemo.showBug1(myList));
        System.out.println("showBug2 result: " + bugDemo.showBug2(myArray));
        System.out.println("showBug3 result: " + bugDemo.showBug3(myList));

        // Testing mutants
        System.out.println("showBug1Mutant1 result: " + bugDemo.showBug1Mutant1(myList));
        System.out.println("showBug2Mutant2 result: " + bugDemo.showBug2Mutant2(myArray));
        System.out.println("showBug3Mutant3 result: " + bugDemo.showBug3Mutant3(myList));
    }
}