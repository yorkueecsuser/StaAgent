import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else statement unreachable.
        return false;
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}