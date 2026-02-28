import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        while (false) {
            // Unreachable code
            System.out.println("This line should never be executed");
        }
        return list.contains(list); // Bug: DMI: Collections should not contain themselves
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);