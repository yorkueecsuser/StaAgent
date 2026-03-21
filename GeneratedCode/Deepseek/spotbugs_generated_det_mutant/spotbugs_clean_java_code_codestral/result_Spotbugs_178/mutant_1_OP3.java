// Java code demonstrating the EI2 bug with the "Unreachable if statement" mutation
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        // Inserting unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if statement unreachable
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}