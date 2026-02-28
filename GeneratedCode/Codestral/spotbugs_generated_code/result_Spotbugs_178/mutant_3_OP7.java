// Java code demonstrating the EI2 bug with an unreachable while loop mutation
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
        }
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }

    // This method is required by the unreachable while loop mutation
    private boolean getCondition() {
        return false;
    }
}