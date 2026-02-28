import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement mutation
            // This branch is unreachable because shouldRun is always false
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                return list.contains(list.get(0));
            }
        }
        return list.contains(list); // BUG: DMI: Collections should not contain themselves
    }

    // A method to get a condition that is always false
    private boolean getCondition() {
        return false;
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);