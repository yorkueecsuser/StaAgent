import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        // Mutant: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed");
        } else {
            System.out.println("This else block should not be executed either");
        }

        return result;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}