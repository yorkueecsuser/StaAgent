import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Original code
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            immutableList.add("This will never execute");
        }
    }

    private boolean falseMethod() {
        return false; // This ensures that the condition is always false
    }
}