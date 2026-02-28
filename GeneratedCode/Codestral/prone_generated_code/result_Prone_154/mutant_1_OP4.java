import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean getUnreachableCondition() {
        return false; // new method to always return false
    }

    public boolean showBug(List<Integer> list) {
        if (getUnreachableCondition()) {
            // This if block is unreachable
            System.out.println("This line will never be executed.");
        } else {
            // The original code
            return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
        }
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}