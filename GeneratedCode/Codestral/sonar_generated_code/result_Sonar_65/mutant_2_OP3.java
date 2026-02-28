import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        // Mutant code for unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }

        return result;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }

    // Method to ensure the unreachable condition is always false
    private boolean isUnreachable() {
        return false;
    }
}