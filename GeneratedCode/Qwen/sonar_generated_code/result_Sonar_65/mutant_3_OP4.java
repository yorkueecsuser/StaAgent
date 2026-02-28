import java.util.ArrayList;
import java.util.List;

class CollectionAndArrayBug {

    public boolean showBug1(List<Integer> myList) {
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if block");
        } else {
            System.out.println("This is an unreachable else block");
        }
    }

    public boolean showBug2(int[] myArray) {
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        return result;
        
        // Mutant: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if block");
        } else {
            System.out.println("This is an unreachable else block");
        }
    }

    public boolean showBug3(List<Integer> myList) {
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if block");
        } else {
            System.out.println("This is an unreachable else block");
        }
    }

    public static void main(String[] args) {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        
        System.out.println("showBug1 result: " + bugDemo.showBug1(myList));
        System.out.println("showBug2 result: " + bugDemo.showBug2(myArray));
        System.out.println("showBug3 result: " + bugDemo.showBug3(myList));
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will always return false, but it's not a compile-time constant
    }
}