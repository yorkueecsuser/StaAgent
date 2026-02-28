import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    // Method to return a value that always evaluates to false
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        if (list.size() >= 0) {
            // Insert unreachable switch statement
            boolean condition = getFalseCondition();
            if (condition) {
                // This switch statement is unreachable
                switch (list.size()) {
                    case 1:
                        System.out.println("Case 1");
                        break;
                    default:
                        System.out.println("Default case");
                        break;
                }
            }
        }
        return list.size() >= 0;
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}