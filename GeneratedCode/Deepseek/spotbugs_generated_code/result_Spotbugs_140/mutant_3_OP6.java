import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This code will never be executed
        }
        return list.contains(list); // Original bug is still present
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);