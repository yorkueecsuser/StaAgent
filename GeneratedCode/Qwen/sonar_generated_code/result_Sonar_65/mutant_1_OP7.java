import java.util.ArrayList;
import java.util.List;

class CollectionAndArrayBug {

    public boolean showBug1(List<Integer> myList) {
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
            return true;
        }
        return false;
    }

    public boolean showBug2(int[] myArray) {
        boolean result = myArray.length >= 0; // BUG: Collection sizes and array length comparisons should make sense
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return result;
    }

    public boolean showBug3(List<Integer> myList) {
        if (myList.size() < 0) { // BUG: Collection sizes and array length comparisons should make sense
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
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