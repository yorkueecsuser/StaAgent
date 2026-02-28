import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
        // Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                break;
            default:
                break;
        }
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar;
    }

    // This method is used to get a boolean value for the switch statement condition.
    private boolean getCondition() {
        return false;
    }
}