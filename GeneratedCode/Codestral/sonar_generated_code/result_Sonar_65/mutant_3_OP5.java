import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private int getUnreachableValue() {
        return 0; // this method always returns 0, making the switch statement unreachable
    }

    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        // Introducing the unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
            default:
                break;
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