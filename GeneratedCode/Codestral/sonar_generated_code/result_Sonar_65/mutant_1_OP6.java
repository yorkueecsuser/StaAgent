import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        // Added unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        return result;
    }

    // Dummy method to return false, making the for loop unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}