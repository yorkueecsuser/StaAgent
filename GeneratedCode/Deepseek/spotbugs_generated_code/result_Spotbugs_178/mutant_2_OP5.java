import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // Original bug: EI2
    }

    public void showBug(String newData) {
        data.add(newData);

        // Mutated code: Unreachable switch statement
        boolean shouldRunSwitch = getCondition(); // Ensure this method returns false
        switch (3) {
            case 1:
                if (shouldRunSwitch) {
                    System.out.println("This line should not be reached.");
                }
                break;
            default:
                break;
        }
    }

    public List<String> getData() {
        return data;
    }

    // Method to dynamically determine the condition for the switch statement
    private boolean getCondition() {
        return false;
    }
}