import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Inserted unreachable for loop
            System.out.println("This loop will never be executed");
        }

        if (myList.size() >= 0) {
            System.out.println("List size is non-negative");
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