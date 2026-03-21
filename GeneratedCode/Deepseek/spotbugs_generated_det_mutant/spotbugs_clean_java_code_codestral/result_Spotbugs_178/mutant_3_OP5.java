// Java code with the EI2 bug and the inserted mutant
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        data.add(newData);

        boolean unreachableCondition = false; // Always evaluates to false to make the switch unreachable
        switch (unreachableCondition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            default:
                // This is the only reachable code in the switch statement
                break;
        }
    }

    public List<String> getData() {
        return data;
    }
}