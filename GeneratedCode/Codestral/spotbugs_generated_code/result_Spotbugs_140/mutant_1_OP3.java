import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        // Original code
        boolean containsSelf = list.contains(list);

        // Added mutant code
        boolean condition = getCondition();
        if (condition) {
            throw new AssertionError("Unreachable code block reached");
        }

        return containsSelf;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// buggyList.add(buggyList); // Added to maintain the original bug
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);