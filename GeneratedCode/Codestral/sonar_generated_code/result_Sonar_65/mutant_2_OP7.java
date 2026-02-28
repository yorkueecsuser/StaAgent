import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Inserted unreachable while loop
                System.out.println("This loop is unreachable");
                break;
            }
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        return result;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}