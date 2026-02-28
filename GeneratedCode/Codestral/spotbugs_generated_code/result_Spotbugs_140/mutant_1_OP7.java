import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because the condition is always false
            //...
        }
        // Original code
        return list.contains(list); // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    }

    // Dummy method to return false for the condition of the while loop
    private boolean getCondition() {
        return false;
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);