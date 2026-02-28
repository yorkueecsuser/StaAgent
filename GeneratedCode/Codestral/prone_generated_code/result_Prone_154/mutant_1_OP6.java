import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    private boolean getFalseCondition() {
        return false;   // Method to return a false condition
    }

    public boolean showBug(List<Integer> list) {
        boolean conditionFor = getFalseCondition();  // Using the false condition in the for loop
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop!");
        }
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}