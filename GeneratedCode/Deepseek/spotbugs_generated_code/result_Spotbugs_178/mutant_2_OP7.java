// Java code demonstrating the EI2 bug with added unreachable while loop
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        // MUTATION: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
            System.out.println("This is an unreachable loop");
        }
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}