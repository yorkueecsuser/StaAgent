import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);

        boolean unreachableCondition = unreachableMethod();
        if (unreachableCondition) {
            System.out.println("This branch should be unreachable");
        }

        return result;
    }

    public boolean unreachableMethod() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}