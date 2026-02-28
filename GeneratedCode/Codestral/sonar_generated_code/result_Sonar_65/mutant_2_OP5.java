import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private boolean getCondition() {
        // Always return false to ensure unreachable switch statement
        return false;
    }

    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        if (getCondition()) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable switch statement executed");
                    break;
            }
        }

        return result;
    }

    private int getValue() {
        // Always return a value that doesn't match any case in the switch statement
        return 0;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}