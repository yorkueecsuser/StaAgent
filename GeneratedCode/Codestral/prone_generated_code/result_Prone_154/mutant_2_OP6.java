import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        for (int i = 0; isConditionFalse(); i++) { // Inserted unreachable for loop
            System.out.println("This loop is unreachable");
        }
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    // Method to return a false condition
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}