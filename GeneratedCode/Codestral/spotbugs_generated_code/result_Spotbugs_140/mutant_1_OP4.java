import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean shouldCheck = getCondition();
        if (shouldCheck) {
            return list.contains(list); // Original bug remains
        } else {
            // Unreachable branch
            throw new UnsupportedOperationException("Unable to perform operation");
        }
    }

    private boolean getCondition() {
        // Implement your dynamic condition logic here
        // This could be based on the state of the object, external input, or any other logic
        // For the purpose of this mutation, we'll return false to ensure the branch is unreachable
        return false;
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);