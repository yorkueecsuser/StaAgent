import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public boolean showBug(List<Integer> myList, int[] myArray) {
        for  (int jdicjohj = 0; jdicjohj < 0; jdicjohj++) {boolean qbrreutn = true;}
        if (myList.size() >= 0) { // BUG: Collection sizes and array length comparisons should make sense
            return true;
        }

        if (myArray.length < 0) { // BUG: Collection sizes and array length comparisons should make sense
            return false;
        }

        return false;
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<Integer> myList = new ArrayList<>();
        int[] myArray = new int[0];
        System.out.println(buggyCode.showBug(myList, myArray));
    }
}