import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();

        // Mutation: Unreachable if-else statement
        // This if-else statement is unreachable because the condition is always false.
        // Correct: boolean condition = false; if (condition) { /* code */ }
        // Mutant Code:
        boolean condition = getCondition();
        if (condition) {
            // Do nothing
        } else {
            bar.add("This branch is unreachable");
        }

        return bar;
    }

    // Helper method to get a non-final value, ensuring the condition is dynamically determined at runtime.
    private boolean getCondition() {
        return false;
    }
}