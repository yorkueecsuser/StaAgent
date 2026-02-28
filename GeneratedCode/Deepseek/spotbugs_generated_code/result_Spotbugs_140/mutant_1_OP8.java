import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> l) {
        return l.contains(l); // Original bug remains intact
    }

    public boolean mutantCode(List<Object> a) {
        return a.contains(a); // Mutated code: Renamed variable 'list' to 'a'
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);
// boolean mutantResult = bug.mutantCode(buggyList);