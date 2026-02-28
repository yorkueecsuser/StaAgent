import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object

        // Mutation: Unreachable while loop
        boolean alwaysFalse = getFalseCondition();
        while (alwaysFalse) {
            System.out.println("This will never be executed.");
        }
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }

    // This method will always return false
    private boolean getFalseCondition() {
        return false;
    }
}