import java.util.ArrayList;
import java.util.List;

class CollectionsBug {
    public boolean showBug(List<Object> list) {
        boolean containsSelf = false;
        int i = 0;
        do {
            if (list.get(i) == list) {
                containsSelf = true;
                break;
            }
            i++;
        } while (i < list.size());
        return containsSelf;  // BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    }
}

// Usage:
// List<Object> buggyList = new ArrayList<>();
// CollectionsBug bug = new CollectionsBug();
// boolean result = bug.showBug(buggyList);