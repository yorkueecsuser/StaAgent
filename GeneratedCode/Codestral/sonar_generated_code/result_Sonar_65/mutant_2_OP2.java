import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
            int listSize = myList.size(); // Added mutant code
        }

        boolean result = myArray.length >= 0;
        System.out.println("Array length is non-negative: " + result);
        int arrayLength = myArray.length; // Added mutant code

        return result;
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[5];
        bc.showBug(myList, myArray);
    }
}