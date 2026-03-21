import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean conditionWhile = false; // Always false to make the loop unreachable
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is an unreachable block of code");
        }
        return list.contains(list); // Original bug remains
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);