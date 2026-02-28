import java.util.ArrayList;
import java.util.List;

class CollectionAndArrayBug {

    public boolean showBug1(List<Integer> myList) {
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) { // This condition is dynamically determined at runtime and should be false
            System.out.println("This is an unreachable statement in showBug1");
        }
    }

    public boolean showBug2(int[] myArray) {
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        return result;
        
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) { // This condition is dynamically determined at runtime and should be false
            System.out.println("This is an unreachable statement in showBug2");
        }
    }

    public boolean showBug3(List<Integer> myList) {
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }
        return false;
        
        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) { // This condition is dynamically determined at runtime and should be false
            System.out.println("This is an unreachable statement in showBug3");
        }
    }

    private boolean getCondition() {
        // This method should return false to ensure the if statement is unreachable
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