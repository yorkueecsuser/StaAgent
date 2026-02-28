import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CompareToBugExample {

    public int showBug(String str1, String str2) {
        return buggyCompareToCheck(str1, str2);
    }

    private int buggyCompareToCheck(String str1, String str2) {
        int comparisonResult = str1.compareTo(str2);
        
        if (comparisonResult == -1) { // BUG: "compareTo" results should not be checked for specific values
            return -1;
        } else if (comparisonResult == 1) { // BUG: "compareTo" results should not be checked for specific values
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug("apple", "banana"));
        System.out.println(example.showBug("banana", "apple"));
        System.out.println(example.showBug("orange", "orange"));
    }
}