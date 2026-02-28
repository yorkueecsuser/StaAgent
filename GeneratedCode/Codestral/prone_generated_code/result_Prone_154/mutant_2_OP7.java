import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        boolean condition = getFalseCondition();
        while (condition) { // Mutant: Unreachable while loop
            // This loop is unreachable as the condition is always false
            System.out.println("This line should not be executed");
        }
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}