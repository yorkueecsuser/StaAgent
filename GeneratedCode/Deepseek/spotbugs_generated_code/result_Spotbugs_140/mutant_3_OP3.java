import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            return false; // Unreachable code
        }
        return list.contains(list); // Original bug still exists
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);