import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    private boolean getCondition() {
        return false; // Method to return a false value to avoid compile-time errors
    }

    public boolean showBug(List<Integer> list) {
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return list.size() >= 0;
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}