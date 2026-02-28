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

        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition? 1 : 0) {
            case 1:
                System.out.println("This is an unreachable switch statement");
                break;
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