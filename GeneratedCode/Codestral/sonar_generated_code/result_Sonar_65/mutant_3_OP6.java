import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
            // Mutant: Added an unreachable for loop
            for (int i = 0; getFalseCondition(); i++) {
                System.out.println("This line should never print");
            }
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