import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    // Method to return false for the unreachable if statement
    public boolean getCondition() {
        return false;
    }

    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        // Inserted unreachable if statement
        if (getCondition()) {
            System.out.println("This statement will never be executed");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        return result;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}