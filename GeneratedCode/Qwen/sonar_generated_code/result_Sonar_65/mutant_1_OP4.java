import java.util.ArrayList;
import java.util.List;

class CollectionAndArrayBug {

    public boolean showBug1(List<Integer> myList) {
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block in showBug1");
        } else {
            System.out.println("This is another unreachable block in showBug1");
        }
    }

    public boolean showBug2(int[] myArray) {
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        return result;
        
        // Mutant: Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block in showBug2");
        } else {
            System.out.println("This is another unreachable block in showBug2");
        }
    }

    public boolean showBug3(List<Integer> myList) {
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            System.out.println("This is an unreachable block in showBug3");
        } else {
            System.out.println("This is another unreachable block in showBug3");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionAndArrayBug bugDemo = new CollectionAndArrayBug();
        
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        
        System.out.println("showBug1 result: " + bugDemo.showBug1(myList));
        System.out.println("showBug2 result: " + bugDemo.showBug2(myArray));
        System.out.println("showBug3 result: " + bugDemo.showBug3(myList));
    }
}